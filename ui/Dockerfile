FROM nginx
COPY /ui /usr/share/nginx/html
COPY cors.conf /etc/nginx/conf.d/
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
