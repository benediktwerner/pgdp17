#!/bin/bash
jekyll build
scp * -r _site/* wernerbe@lxhalle.in.tum.de:home_page/html-data/pgdp/
