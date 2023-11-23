#!/bin/bash

read -p "Enter IP : " ip
if [[ $ip =~ ^[0-9]+\.[0-9]+\.[0-9]+\.[0-9]+$ ]]
then
        echo "Success"
        read -p "`hostname -I`"
else
        echo "Fail"
fi

