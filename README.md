# Education

Coursework from university, organized by semester and course.

## Structure

```
<Semester>/
  <Course>/
    Lab01/
      ...source code...
    Lab02/
      ...
```

Each lab folder contains only the code/source needed to run it. Assignment
text, personal notes, and any course manuals/textbooks are kept out of the
repo (see below), so this is not a complete record of the coursework - just
the code.

## What's excluded

Anything that shouldn't be public - instructor-provided assignment/task
text, personal notes or exam-prep material, manuals, report drafts - lives
locally in a folder named `private/` next to the relevant lab, which is
gitignored. See `.gitignore` for the full set of rules (build artifacts,
IDE folders, etc. are also excluded).
