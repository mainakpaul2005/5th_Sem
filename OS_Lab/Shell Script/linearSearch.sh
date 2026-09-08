#!/bin/bash

function linearSearch()
{
    local array=("$@")
    read -p "Enter Key to Search: " key
    for i in "${array[@]}"
    do
        if [ "$i" -eq "$key" ]
        then
            echo "Key Found"
            return
        fi
    done
    echo "Key Not Found!!"
}

array=(10 20 30 40 50 60)
linearSearch "${array[@]}"