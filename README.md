# 2020 Coding Practice

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#https://github.com/jmjava/2020Code)

## This workspace:

### Python
### Java
### Go

## Coming Soon in Related Projects

### Flutter / Dart 
### Julia 
### Lua 
### Rust/Webassembly 

## Planned:

### Envoy proxy
### Gloo
### Ansible


Notes on importing subtree

git remote add XXX_remote <path-or-url-to-XXX-repo>
  
git fetch XXX_remote

git merge --allow-unrelated-histories -s ours --no-commit XXX_remote/master

git read-tree --prefix=ZZZ/ -u XXX_remote/master

git commit -m "Imported XXX as a subtree."

git remote rm XXX_remote

git push







