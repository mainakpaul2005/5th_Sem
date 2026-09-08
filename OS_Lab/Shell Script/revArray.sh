#!/bin/bash

function revArr()
{
    local array=("$@")
    echo -n "Reversed Array: "
    for ((i="$#"-1 ; i>=0 ; i--))
    do
        echo -n " ${array[i]} "
    done
    echo
}

array=(10 20 30 40 50 60)
revArr "${array[@]}"