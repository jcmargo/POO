FROM python:3.8

WORKDIR /Js
#local/contenedor
COPY requirements.txt /Js/requirements.txt

RUN pip install --no-cache-dir --upgrade -r /Js/requirements.txt

COPY . /Js

CMD bash -c 'while true; do sleep 1; done'