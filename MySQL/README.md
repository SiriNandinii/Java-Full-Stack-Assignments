# 🌸💪 Gym Management System Database 💪🌸

### *a cozy little corner of the internet where SQL meets sweat* 🧸✨

welcome, welcome!! 🎀 pull up a chair, grab a warm drink ☕ and let's talk about this snuggly little **Gym Management System Database** i built ~ it's made with love, MySQL, and a sprinkle of database magic 🪄

---

## 🍰 what even is this??

this little project is a relational database made to help manage all the fun (and sometimes chaotic 😵‍💫) bits of running a gym — members, trainers, plans, and all that squeaky gym equipment 🏋️‍♀️🧘‍♀️

it's basically a soft, organized home 🏠 for:
- 🧑‍🏫 trainers and their specialties
- 📋 membership plans
- 🧍 members (the real stars of the show!)
- 🏋️ equipment inventory

built to practice all the yummy **DBMS concepts** — joins, constraints, aggregate functions and more, all wrapped up in one cozy database blanket 🧶

---

## 🐣 database name

```
gym
```
short, sweet, and to the point 🍓

---

## 🌷 the fam (aka our 4 tables)

| table | what it's for 💭 |
|---|---|
| 🧑‍🏫 Trainers | keeps track of our lovely trainers |
| 📋 Membership_Plan | all our cute membership packages |
| 🧍 Members | our gym family's info |
| 🏋️ Equipment | all the gear, big and small |

---

## 🎈 how everyone's connected

```
Membership Plan 🎫
        │
        │
        ▼
     Members 🧍
        ▲
        │
        │
    Trainers 🧑‍🏫

Equipment 🏋️
(its own independent lil island 🏝️)
```

each member gets:
- 💗 one trainer to cheer them on
- 📦 one membership plan
- ✨ and equipment just chills separately, doing its own thing

---

## 🧸 table deep-dive (with all the fuzzy details)

### 1️⃣ Trainers Table 🧑‍🏫
our trainers are the heart of the gym! this table holds all their sweet details.

**🔑 primary key:** `trainer_id`

| column | what's inside 🎀 |
|---|---|
| trainer_id | a special little id just for them |
| trainer_name | their lovely name |
| specialization | yoga? cardio? strength? crossfit? |
| experience | years of experience 🌟 |
| salary | their well-earned 💰 |
| phone | for a quick ring-ring 📞 |
| certification | fancy credentials 🎓 |

**cozy rules:** no empty names allowed, phone numbers must be one-of-a-kind, and experience can't be negative (time travel isn't real, sorry 🕰️)

meet a few of our trainers: Rahul Sharma, Priya Reddy, Arjun Mehta, Sneha Kapoor, Vikram Singh 🥰

---

### 2️⃣ Membership_Plan Table 🎫
all our cute lil packages live here, ready to be picked!

**🔑 primary key:** `plan_id`

| plan | duration ⏳ |
|---|---|
| Basic | 1 month |
| Standard | 3 months |
| Premium | 6 months |
| Elite | 12 months |
| Student | 6 months |

benefits range from simple gym access all the way up to personal trainers and all-the-facilities glow ups ✨

---

### 3️⃣ Members Table 🧍💕
this is the comfy center of it all — where trainers and plans come together to make a member's whole gym journey 🌈

**🔑 primary key:** `member_id`
**🔗 foreign keys:** `trainer_id`, `plan_id`

holds all the soft little details — name, gender, age, contact info, join date, and who's guiding them on their fitness journey 🧘

**gentle rules:** phone & email must be unique (no cloning allowed 🧬), and members must be 16+ 🎂

---

### 4️⃣ Equipment Table 🏋️‍♀️
every dumbbell and treadmill gets a cozy little record here too!

**🔑 primary key:** `equipment_id`

tracks category (cardio, strength, bodyweight 💪), purchase date, condition (excellent/good/maintenance), and how many we've got

**default setting:** condition starts off as "Good" because we like to think positive 🌤️

---

## 💞 relationships, but make it wholesome

**trainer → members**: one trainer, many members cheering along 🎉
```
Trainer (1) → Members (Many)
```

**plan → members**: one plan, many happy members enrolled 🌟
```
Plan (1) → Members (Many)
```

**equipment**: does its own independent thing, no strings attached 🎈

---

## 🔐 the comfy rules keeping everything tidy (constraints)

- 🗝️ **primary keys** — everyone's got their own special id
- 🔗 **foreign keys** — linking members to their trainers & plans
- 🚫 **not null** — the important stuff never gets left empty
- 💎 **unique** — no duplicate phones or emails, everyone's one of a kind
- ✅ **check** — keeping numbers sensible (no negative salaries, no baby members!)
- 🎁 **default** — auto-fills like join date = today, condition = Good

---

## 🛠️ growing & changing (schema updates)

just like us, the database grows over time! 🌱

- ➕ added: trainer certifications, member emails
- ➖ removed: favorite color, blood group *(sweet while they lasted, but not needed anymore 🥲)*

all done with `ALTER TABLE`, no need to rebuild the whole house 🏡

---

## 🌼 CRUD — the full circle of database life

- 🌱 **Create** — new database, tables, and records sprouting up
- 📖 **Read** — peeking in to see totals, top salaries, average prices, oldest members, and more
- 🔄 **Update** — salary bumps, plan swaps, equipment condition refreshes
- 🍂 **Delete** — saying goodbye to old equipment when it's time

---

## 📊 sql concepts, cozily explained

- **aggregate functions** 🧮 — COUNT, SUM, AVG, MAX, MIN
- **GROUP BY** 🗂️ — grouping members by plan, equipment by category
- **HAVING** 🔍 — only showing groups that matter (like plans with 2+ members!)
- **ORDER BY** 📏 — sorting by age, price, whatever feels right
- **LIMIT & OFFSET** ✂️ — just the top 3 oldest members, please!
- **nested queries** 🪆 — finding trainers earning above the average, like a lil treasure hunt
- **INNER JOIN** 🤝 — matching members with trainers & plans
- **LEFT JOIN** 🫂 — showing every trainer, even the ones without members yet (they still matter!)
- **WHERE filtering** 🔎 — finding premium members paying over ₹5000

---

## 🍬 sample data snapshot

- 🧑‍🏫 5 trainers
- 🎫 5 membership plans
- 🧍 10 members
- 🏋️ 8 equipment pieces *(down to 7 after our little delete demo 🥹)*

---

## ✨ key features, all wrapped up

- 🧵 neatly normalized design
- 🔒 strong data integrity
- 🌸 one-to-many relationships done right
- 🍰 full CRUD operations
- 🧱 schema evolution with ALTER TABLE
- ⚡ efficient queries (joins, grouping, filtering, and more!)
- 🎨 realistic, friendly sample data

---

## 🌈 where this could live

this snuggly database could power:
- 🏋️ gym management systems
- 🧘 fitness center management
- 🏥 health club admin
- 🎯 personal training tracking
- 📇 membership tracking systems
- 🧰 equipment inventory tools

---

## 🧵 built with

- 🐬 **MySQL**
- 📝 **SQL**
- concepts: DDL, DML, DQL, constraints, joins, aggregates, nested queries, ALTER TABLE, CRUD, GROUP BY, HAVING, ORDER BY, LIMIT/OFFSET, and foreign keys 🔗

---

## 💌 a little closing note

thanks so much for stopping by this cozy database project 🌷 it was made to be a soft, simple, and practical way to learn real-world DBMS concepts — trainers, members, plans, and equipment all living happily together in one well-organized home 🏡💕

if this made your day a little softer, that makes me happy 🧸✨

*made with 🤍 and a lot of semicolons*
