#!/bin/bash


echo "Please enter your username: "
read username
if [[ $username =~ ^[A-Z]+$ ]]
then
        echo "Thank you, your username is $username"
else
        echo "Invalid username. Please try again."
fi


