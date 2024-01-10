# Verwende das neueste Nginx-Image als Basis
FROM nginx:latest

# Kopiere die UI-Dateien in das Nginx-Verzeichnis
COPY ./static /usr/share/nginx/html

# Kopiere die CORS-Konfigurationsdatei
COPY ./cors.conf /etc/nginx/conf.d/cors.conf

# Port 80 freigeben
EXPOSE 80


# Führe Nginx im Vordergrund aus
CMD ["nginx", "-g", "daemon off;"]
