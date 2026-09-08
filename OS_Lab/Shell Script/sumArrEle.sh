#!/bin/bash

function sumArr()
{
    local array=("$@")
    sum=0
    for i in "${array[@]}"
    do
        sum=$((sum+i))
    done
    echo "Sum = $sum"
}

array=(10 20 30 40 50 60)
sumArr "${array[@]}"