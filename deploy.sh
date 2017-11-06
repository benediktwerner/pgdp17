#!/bin/bash
JEKYLL_ENV=production jekyll build
scp -r _site/* wernerbe@lxhalle.in.tum.de:home_page/html-data/pgdp/
