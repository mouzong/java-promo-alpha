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
elif [ "$action" = "delete" ]; then
read -p "Êtes-vous sûr de supprimer le dossier 'out' (y/n)? " reponse
if [ "$reponse"="y" ]; then
rm -r out
fi
echo "Dossier out supprimé"
else
echo "Aucun choix effectué"
fi