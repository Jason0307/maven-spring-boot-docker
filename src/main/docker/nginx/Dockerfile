FROM nginx
MAINTAINER Jason Zhu <zrb0307@gmail.com>
COPY nginx.conf /etc/nginx/
COPY default.conf /etc/nginx/conf.d/
EXPOSE 80
RUN echo "daemon off;" >> /etc/nginx/nginx.conf
CMD service nginx start