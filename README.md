# 2020 Coding Practice

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#https://github.com/jmjava/2020Code)

# Note: several git repos have been imported for convenience 

## Notes on importing subtree

git remote add XXX_remote <path-or-url-to-XXX-repo>
  
git fetch XXX_remote

git merge --allow-unrelated-histories -s ours --no-commit XXX_remote/master

git read-tree --prefix=ZZZ/ -u XXX_remote/master

git commit -m "Imported XXX as a subtree."

git remote rm XXX_remote

git push







