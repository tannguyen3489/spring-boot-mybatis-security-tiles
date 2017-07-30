lessc ./style.less > ./bootstrap/dist/css/bootstrap.css --source-map-less-inline --source-map-map-inline

watch-lessc -i ./style.less -o ./bootstrap/dist/css/bootstrap.css --source-map-less-inline --source-map-map-inline

lesser-watch -c 'lessc --source-map-map-inline | postcss --map | exorcist static/`basename $SOURCE_FILE_PATH`.map' -e ./style.less -d ./bootstrap/dist/css/bootstrap.css;


// perfect command

while inotifywait -r style.less; do
    lessc ./style.less > ./bootstrap/dist/css/bootstrap.css --source-map-less-inline --source-map-map-inline
done
