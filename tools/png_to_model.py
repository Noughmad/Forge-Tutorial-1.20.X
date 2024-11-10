#!/bin/env python3

import argparse
import os
import json
import shutil

def get_block_name(filename):
    base = os.path.basename(filename)
    name, _ = os.path.splitext(base)
    return name

def add_block(infile, name, dir, project_name):
    json_files = []

    base = f"{dir}/src/main/resources/assets/{project_name}"

    # blockstate
    json_files.append((
        f"{base}/blockstates/jani_{name}_block.json",
        {
            "variants": {
                "": {
                    "model": f"{project_name}:block/jani_{name}_block"
                }
            }
        }
    ))
    # block model
    json_files.append((
        f"{base}/models/block/jani_{name}_block.json",
        {
            "parent": "minecraft:block/cube_all",
            "textures": {
                "all": f"{project_name}:block/jani_{name}_block"
            }   
        }
    ))
    # item model
    json_files.append((
        f"{base}/models/item/jani_{name}_block.json",
        {
            "parent": f"{project_name}:block/jani_{name}_block"
        }
    ))

    for filename, data in json_files:
        with open(filename, 'wt') as f:
            json.dump(data, f, indent=4)
    
    texture_name = f"{base}/textures/block/jani_{name}_block.png"
    shutil.copyfile(infile, texture_name)

    en = {}
    with open(f"{base}/lang/en_us.json", "r") as f:
        en = json.load(f)
    en[f"block.{project_name}.jani_{name}_block"] = f"Jani {name}"    
    with open(f"{base}/lang/en_us.json", "w") as f:
        json.dump(en, f, indent=4)

    java_files = []

    java_files.append((
        f"{dir}/src/main/java/net/kaupenjoe/tutorialmod/block/ModBlocks.java",
        f"""public static final RegistryObject<Block> JANI_{name}_BLOCK = registerBlock("jani_{name}_block",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    """
    ))
    java_files.append((
        f"{dir}/src/main/java/net/kaupenjoe/tutorialmod/item/ModCreativeModTabs.java",
        f"""pOutput.accept(ModBlocks.JANI_{name}_BLOCK.get());
                        """
    ))

    for filename, data in java_files:
        text = ""
        with open(filename, "r") as f:
            text = f.read()
            new_text = text.replace("// ADD BLOCKS HERE", data + "// ADD BLOCKS HERE")
        with open(filename, "w") as f:
            f.write(new_text)

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("infile", type=str)
    parser.add_argument("-n", "--name", type=str, help="Block name, derived from file name if not provided")
    parser.add_argument("-d", "--dir", type=str, help="Project directory, defaults to the current directory")
    parser.add_argument("-p", "--project-name", type=str, help="Project name", default="jani_2048_tiles")

    args = parser.parse_args()

    block_name = args.name or get_block_name(args.infile)
    project_name = args.project_name
    dir = args.dir or os.getcwd()

    add_block(args.infile, block_name, dir, project_name)

if __name__ == "__main__":
    main()