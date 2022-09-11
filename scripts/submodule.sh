echo "Pulling submodules..."
set -r
git submodule init
git submodule set-branch --branch main
git submodule update --recursive --remote