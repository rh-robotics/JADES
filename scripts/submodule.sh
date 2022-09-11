echo "Pulling submodules..."
set -r
git submodule init
git submodule update --recursive --remote