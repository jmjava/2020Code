function Save(level, health, lives)
 file = io.open("save.lua", "w")
 file:write("return { \n")
 file:write("\tlevel = ", level, ",", "\n")
 file:write("\thealth = ", health, ",", "\n")
 file:write("\tlives = ", lives, "\n")
 file:write("}")
 file:close()
end
Save(20, 10, 2)

--[[gameData = require("save")
print("Loaded:")
print("\tlevel: " .. gameData.level)
print("\thealth: " .. gameData.health)
print("\tlives: " .. gameData.lives)--]]

Save(20, 10, 2)
gameData = dofile("save.lua")
print("Loaded:")
print("\tlevel: " .. gameData.level)
print("\thealth: " .. gameData.health)
print("\tlives: " .. gameData.lives)
Save(10, 10, 5)
gameData = dofile("save.lua")
print("Loaded:")
print("\tlevel: " .. gameData.level)
print("\thealth: " .. gameData.health)
print("\tlives: " .. gameData.lives)