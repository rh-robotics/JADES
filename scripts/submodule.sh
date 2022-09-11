echo "Pulling submodules..."

# Initialize the submodules and then update
git submodule init
git submodule update --recursive --remote
