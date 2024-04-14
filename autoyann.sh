#!/usr/bin/bash


read -p "Que voulez-vous faire? " action

if [ "$action" = "push" ]; then
git add .
read -p "Entrez le motif du commit : " motif
git commit -m "$motif"
git push
echo "push effectué"
elif [ "$action" = "pull" ]; then
git pull
echo "pull effectué"
else
echo "Aucun choix effectué"
fi