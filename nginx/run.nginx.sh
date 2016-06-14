#!/bin/sh

docker run -d --name jason_customized_nginx -p 80:80 -v //c/Users/renbzhu/docker/jason-nginx-repo/html:/usr/share/nginx/html jason_nginx 
