-- Gui to Lua
-- Version: 3.2

-- Instances:

local MainForJava = Instance.new("ScreenGui")
local Loading = Instance.new("Frame")
local UICorner = Instance.new("UICorner")
local Loadtxt = Instance.new("TextLabel")
local tct = Instance.new("TextLabel")
local LoadUI = Instance.new("Frame")
local UICorner_2 = Instance.new("UICorner")
local inside = Instance.new("Frame")
local UICorner_3 = Instance.new("UICorner")
local Java = Instance.new("ImageLabel")
local UICorner_4 = Instance.new("UICorner")
local Text = Instance.new("ImageLabel")
local UICorner_5 = Instance.new("UICorner")
local Close = Instance.new("TextButton")
local UICorner_6 = Instance.new("UICorner")
local MainFrameForJava = Instance.new("ScrollingFrame")
local UICorner_7 = Instance.new("UICorner")
local tcttct = Instance.new("TextLabel")
local UICorner_8 = Instance.new("UICorner")
local Set = Instance.new("TextButton")
local UICorner_9 = Instance.new("UICorner")
local ScriptHub = Instance.new("TextButton")
local UICorner_10 = Instance.new("UICorner")
local Script2 = Instance.new("TextButton")
local UICorner_11 = Instance.new("UICorner")
local Maded = Instance.new("TextButton")
local UICorner_12 = Instance.new("UICorner")
local Shutdown = Instance.new("TextButton")
local UICorner_13 = Instance.new("UICorner")
local VIPGui = Instance.new("TextButton")
local UICorner_14 = Instance.new("UICorner")
local Credits = Instance.new("TextButton")
local UICorner_15 = Instance.new("UICorner")
local Close_2 = Instance.new("TextButton")
local UICorner_16 = Instance.new("UICorner")
local UICorner_17 = Instance.new("UICorner")

--Properties:

MainForJava.Name = "MainForJava"
MainForJava.Parent = game.CoreGui
MainForJava.ZIndexBehavior = Enum.ZIndexBehavior.Sibling

Loading.Name = "Loading"
Loading.Parent = MainForJava
Loading.BackgroundColor3 = Color3.fromRGB(67, 67, 67)
Loading.Position = UDim2.new(0.320985466, 0, 0.357046127, 0)
Loading.Size = UDim2.new(0, 581, 0, 290)

UICorner.Parent = Loading

Loadtxt.Name = "Loadtxt"
Loadtxt.Parent = Loading
Loadtxt.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
Loadtxt.BackgroundTransparency = 1.000
Loadtxt.Position = UDim2.new(0.137011215, 0, 0, 0)
Loadtxt.Size = UDim2.new(0, 421, 0, 35)
Loadtxt.Font = Enum.Font.SourceSans
Loadtxt.Text = "RoGuiX-Java Edition"
Loadtxt.TextColor3 = Color3.fromRGB(255, 255, 255)
Loadtxt.TextScaled = true
Loadtxt.TextSize = 14.000
Loadtxt.TextWrapped = true

tct.Name = "tct"
tct.Parent = Loading
tct.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
tct.BackgroundTransparency = 1.000
tct.Position = UDim2.new(0.312570602, 0, 0.206896558, 0)
tct.Size = UDim2.new(0, 217, 0, 60)
tct.Font = Enum.Font.SourceSans
tct.Text = "Loading..."
tct.TextColor3 = Color3.fromRGB(255, 255, 255)
tct.TextScaled = true
tct.TextSize = 14.000
tct.TextWrapped = true

LoadUI.Name = "LoadUI"
LoadUI.Parent = Loading
LoadUI.BackgroundColor3 = Color3.fromRGB(97, 97, 97)
LoadUI.Position = UDim2.new(0.0378657505, 0, 0.482758641, 0)
LoadUI.Size = UDim2.new(0, 537, 0, 73)

UICorner_2.Parent = LoadUI

inside.Name = "inside"
inside.Parent = LoadUI
inside.BackgroundColor3 = Color3.fromRGB(4, 255, 0)
inside.Size = UDim2.new(0, 6, 0, 72)

UICorner_3.Parent = inside

Java.Name = "Java"
Java.Parent = Loading
Java.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
Java.Position = UDim2.new(0.0481927693, 0, 0.0379310362, 0)
Java.Size = UDim2.new(0, 127, 0, 120)
Java.Image = "http://www.roblox.com/asset/?id=2029404641"

UICorner_4.Parent = Java

Text.Name = "Text"
Text.Parent = Loading
Text.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
Text.Position = UDim2.new(0.729776263, 0, 0.0379310362, 0)
Text.Size = UDim2.new(0, 128, 0, 120)
Text.Image = "http://www.roblox.com/asset/?id=8991632711"

UICorner_5.Parent = Text

Close.Name = "Close"
Close.Parent = Loading
Close.BackgroundColor3 = Color3.fromRGB(34, 34, 34)
Close.Position = UDim2.new(0.0671256483, 0, 0.77241379, 0)
Close.Size = UDim2.new(0, 488, 0, 50)
Close.Font = Enum.Font.SourceSans
Close.Text = "Close"
Close.TextColor3 = Color3.fromRGB(255, 255, 255)
Close.TextScaled = true
Close.TextSize = 14.000
Close.TextWrapped = true

UICorner_6.Parent = Close

MainFrameForJava.Name = "MainFrameForJava"
MainFrameForJava.Parent = MainForJava
MainFrameForJava.Active = true
MainFrameForJava.BackgroundColor3 = Color3.fromRGB(43, 255, 255)
MainFrameForJava.Position = UDim2.new(0.645356536, 0, 0.272527486, 0)
MainFrameForJava.Size = UDim2.new(0, 463, 0, 634)
MainFrameForJava.Visible = false

UICorner_7.Parent = MainFrameForJava

tcttct.Name = "tct.tct"
tcttct.Parent = MainFrameForJava
tcttct.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
tcttct.BackgroundTransparency = 1.000
tcttct.Size = UDim2.new(0, 448, 0, 66)
tcttct.Font = Enum.Font.SourceSans
tcttct.Text = "RobloxGui X // Speical Java"
tcttct.TextColor3 = Color3.fromRGB(72, 72, 72)
tcttct.TextScaled = true
tcttct.TextSize = 14.000
tcttct.TextWrapped = true

UICorner_8.Parent = tcttct

Set.Name = "Set"
Set.Parent = MainFrameForJava
Set.BackgroundColor3 = Color3.fromRGB(125, 125, 125)
Set.Position = UDim2.new(0.049568966, 0, 0.0458382815, 0)
Set.Size = UDim2.new(0, 402, 0, 50)
Set.Font = Enum.Font.SourceSans
Set.Text = "Set JumpPower&Speed"
Set.TextColor3 = Color3.fromRGB(255, 255, 255)
Set.TextScaled = true
Set.TextSize = 14.000
Set.TextWrapped = true

UICorner_9.Parent = Set

ScriptHub.Name = "ScriptHub"
ScriptHub.Parent = MainFrameForJava
ScriptHub.BackgroundColor3 = Color3.fromRGB(130, 130, 130)
ScriptHub.Position = UDim2.new(0.049568966, 0, 0.0848604143, 0)
ScriptHub.Size = UDim2.new(0, 402, 0, 50)
ScriptHub.Font = Enum.Font.SourceSans
ScriptHub.Text = "ScriptHub"
ScriptHub.TextColor3 = Color3.fromRGB(255, 255, 255)
ScriptHub.TextScaled = true
ScriptHub.TextSize = 14.000
ScriptHub.TextWrapped = true

UICorner_10.Parent = ScriptHub

Script2.Name = "Script2"
Script2.Parent = MainFrameForJava
Script2.BackgroundColor3 = Color3.fromRGB(131, 131, 131)
Script2.Position = UDim2.new(0.0496760271, 0, 0.123076923, 0)
Script2.Size = UDim2.new(0, 402, 0, 50)
Script2.Font = Enum.Font.SourceSans
Script2.Text = "ScriptHub Page2"
Script2.TextColor3 = Color3.fromRGB(255, 255, 255)
Script2.TextScaled = true
Script2.TextSize = 14.000
Script2.TextWrapped = true

UICorner_11.Parent = Script2

Maded.Name = "Maded?"
Maded.Parent = MainFrameForJava
Maded.BackgroundColor3 = Color3.fromRGB(118, 118, 118)
Maded.Position = UDim2.new(0.0496760271, 0, 0.158791214, 0)
Maded.Size = UDim2.new(0, 401, 0, 50)
Maded.Font = Enum.Font.SourceSans
Maded.Text = "Maked Edition And More"
Maded.TextColor3 = Color3.fromRGB(255, 255, 255)
Maded.TextScaled = true
Maded.TextSize = 14.000
Maded.TextWrapped = true

UICorner_12.Parent = Maded

Shutdown.Name = "Shutdown"
Shutdown.Parent = MainFrameForJava
Shutdown.BackgroundColor3 = Color3.fromRGB(116, 116, 116)
Shutdown.Position = UDim2.new(0.0496760271, 0, 0.197802201, 0)
Shutdown.Size = UDim2.new(0, 401, 0, 50)
Shutdown.Font = Enum.Font.SourceSans
Shutdown.Text = "Shutdown Gui"
Shutdown.TextColor3 = Color3.fromRGB(255, 255, 255)
Shutdown.TextScaled = true
Shutdown.TextSize = 14.000
Shutdown.TextWrapped = true

UICorner_13.Parent = Shutdown

VIPGui.Name = "VIP Gui"
VIPGui.Parent = MainFrameForJava
VIPGui.BackgroundColor3 = Color3.fromRGB(117, 117, 117)
VIPGui.Position = UDim2.new(0.0539956801, 0, 0.234065935, 0)
VIPGui.Size = UDim2.new(0, 400, 0, 50)
VIPGui.Font = Enum.Font.SourceSans
VIPGui.Text = "VIP GUI"
VIPGui.TextColor3 = Color3.fromRGB(255, 255, 255)
VIPGui.TextScaled = true
VIPGui.TextSize = 14.000
VIPGui.TextWrapped = true

UICorner_14.Parent = VIPGui

Credits.Name = "Credits"
Credits.Parent = MainFrameForJava
Credits.BackgroundColor3 = Color3.fromRGB(117, 117, 117)
Credits.Position = UDim2.new(0.0539956801, 0, 0.271098912, 0)
Credits.Size = UDim2.new(0, 400, 0, 50)
Credits.Font = Enum.Font.SourceSans
Credits.Text = "Credits"
Credits.TextColor3 = Color3.fromRGB(255, 255, 255)
Credits.TextScaled = true
Credits.TextSize = 14.000
Credits.TextWrapped = true

UICorner_15.Parent = Credits

Close_2.Name = "Close"
Close_2.Parent = MainFrameForJava
Close_2.BackgroundColor3 = Color3.fromRGB(117, 117, 117)
Close_2.Position = UDim2.new(0.0561555065, 0, 0.307692319, 0)
Close_2.Size = UDim2.new(0, 399, 0, 50)
Close_2.Font = Enum.Font.SourceSans
Close_2.Text = "Close"
Close_2.TextColor3 = Color3.fromRGB(255, 255, 255)
Close_2.TextScaled = true
Close_2.TextSize = 14.000
Close_2.TextWrapped = true

UICorner_16.Parent = Close_2

UICorner_17.Parent = MainFrameForJava

-- Scripts:

local function XUWJLNW_fake_script() -- MainForJava.ToggleKey 
	local script = Instance.new('LocalScript', MainForJava)

	local MainFrame = script.Parent.MainFrameForJava
	local Opened = false
	
	local PositionClosed = UDim2.new(-0.371, 0,0.262, 0)
	local PositionOpened = UDim2.new(0.622, 0,0.293, 0)
	
	local UserInputService = game:GetService("UserInputService")
	
	UserInputService.InputBegan:Connect(function(KeyCode)
		if KeyCode.KeyCode == Enum.KeyCode.F6 then
			if Opened then
				MainFrame:TweenPosition((PositionClosed), "InOut", "Quint")
				Opened = false
			else
				MainFrame:TweenPosition((PositionOpened), "InOut", "Quart")
				Opened = true
			end
		end
	end)
end
coroutine.wrap(XUWJLNW_fake_script)()
local function AALINNZ_fake_script() -- Loading.Draggable 
	local script = Instance.new('LocalScript', Loading)

	local UIS = game:GetService('UserInputService')
	local frame = script.Parent.Parent.Loading
	local dragToggle = nil
	local dragSpeed = 0.25
	local dragStart = nil
	local startPos = nil
	
	local function updateInput(input)
		local delta = input.Position - dragStart
		local position = UDim2.new(startPos.X.Scale, startPos.X.Offset + delta.X,
			startPos.Y.Scale, startPos.Y.Offset + delta.Y)
		game:GetService('TweenService'):Create(frame, TweenInfo.new(dragSpeed), {Position = position}):Play()
	end
	
	frame.InputBegan:Connect(function(input)
		if (input.UserInputType == Enum.UserInputType.MouseButton1 or input.UserInputType == Enum.UserInputType.Touch) then 
			dragToggle = true
			dragStart = input.Position
			startPos = frame.Position
			input.Changed:Connect(function()
				if input.UserInputState == Enum.UserInputState.End then
					dragToggle = false
				end
			end)
		end
	end)
	
	UIS.InputChanged:Connect(function(input)
		if input.UserInputType == Enum.UserInputType.MouseMovement or input.UserInputType == Enum.UserInputType.Touch then
			if dragToggle then
				updateInput(input)
			end
		end
	end)
	
end
coroutine.wrap(AALINNZ_fake_script)()
local function JCNZOC_fake_script() -- tct.LocalScript 
	local script = Instance.new('LocalScript', tct)

	script.Parent.Text = "Loading..."
	wait(2)
	script.Parent.Text = "Initallizing..."
	wait(4)
	script.Parent.Text = "Setting JavaScript..."
	wait(5)
	script.Parent.Text = "Scanning..."
	wait(4)
	script.Parent.Text = "Downloading CMonoco..."
	wait(4)
	script.Parent.Text = "Downloading SChelf..."
	wait(5)
	script.Parent.Text = "Launching......"
	wait(4)
	script.Parent.Text = "Ready! Let's Scripting!"
	wait(2)
	script.Parent.Parent.Parent.Loading.Visible = false
	script.Parent.Parent.Parent.MainFrameForJava.Visible = true
end
coroutine.wrap(JCNZOC_fake_script)()
local function EKSODS_fake_script() -- LoadUI.LocalScript 
	local script = Instance.new('LocalScript', LoadUI)

	-- Variables.
	local frame = script.Parent.Parent.Parent.Loading
	local bar = frame.LoadUI
	local inside = bar.inside
	
	local player = game.Players.LocalPlayer
	
	-- Functions.
	local function ResizeBar(percent)
		inside:TweenSize(UDim2.new(percent/100, 0, 1, 0), Enum.EasingDirection.Out, Enum.EasingStyle.Linear, 1, true)
		wait(1)
	end
	
	-- Start loading.
	game:GetService("StarterGui"):SetCoreGuiEnabled(Enum.CoreGuiType.All, false)
	
	frame.Visible = true
	
	-- Resize to 10%.
	ResizeBar(20)
	
	-- Wait for the character to load.
	repeat wait() until player.Character ~= nil
	wait(3.5)
	ResizeBar(38)
	
	-- Load in assets.
	game:GetService("ContentProvider"):PreloadAsync({workspace, player.PlayerGui})
	wait(4)
	ResizeBar(52)
	--
	wait(4)
	ResizeBar(64)
	--
	wait(3)
	ResizeBar(72)
	--
	wait(3.5)
	ResizeBar(96)
	--
	wait(2.5)
	ResizeBar(100)
	--
	
	
	-- Hide screen.
	wait(1)
	
	game:GetService("StarterGui"):SetCoreGuiEnabled(Enum.CoreGuiType.All, true)
	script.Parent:Destroy()
end
coroutine.wrap(EKSODS_fake_script)()
local function XTQNK_fake_script() -- Close.LocalScript 
	local script = Instance.new('LocalScript', Close)

	script.Parent.MouseButton1Click:Connect(function()
		game.StarterGui:SetCore("SendNotification", {Title = "Closed!", Text = "JavaEdition Loading UI Is Closed."})
		script.Parent.Parent.Parent.Loading.Visible = false
	end)
end
coroutine.wrap(XTQNK_fake_script)()
local function SUGNEAL_fake_script() -- MainForJava.Share Destance 
	local script = Instance.new('LocalScript', MainForJava)

	local plr = game.Players.LocalPlayer
	
	if plr.Name == "john_doe575757" or "ROBLOXRTYUIOPQw" then
		game.StarterGui:SetCore("SendNotification", {Title = "Allowed.", Text = "Allowed User:"..plr.Name})
	else
		game.StarterGui:SetCore("SendNotification", {Title = "Prevention Script Share System", Text = "Invaild UserId:"..plr.Name.." For InJect To Loading Gui"})
		script.Parent.Loading.Visible = false
	end
end
coroutine.wrap(SUGNEAL_fake_script)()
local function CKUTLV_fake_script() -- MainForJava.LocalScript 
	local script = Instance.new('LocalScript', MainForJava)

	local plr = game.Players.LocalPlayer
	
	if plr.Name == "john_doe575757" then
		game.StarterGui:SetCore("SendNotification", {Title = "Developer", Text = "Developer John"})
	end
end
coroutine.wrap(CKUTLV_fake_script)()
local function ORBQV_fake_script() -- tcttct.Draggable 
	local script = Instance.new('LocalScript', tcttct)

	local UIS = game:GetService('UserInputService')
	local frame = script.Parent.Parent.Parent.MainFrameForJava
	local dragToggle = nil
	local dragSpeed = 0.25
	local dragStart = nil
	local startPos = nil
	
	local function updateInput(input)
		local delta = input.Position - dragStart
		local position = UDim2.new(startPos.X.Scale, startPos.X.Offset + delta.X,
			startPos.Y.Scale, startPos.Y.Offset + delta.Y)
		game:GetService('TweenService'):Create(frame, TweenInfo.new(dragSpeed), {Position = position}):Play()
	end
	
	frame.InputBegan:Connect(function(input)
		if (input.UserInputType == Enum.UserInputType.MouseButton1 or input.UserInputType == Enum.UserInputType.Touch) then 
			dragToggle = true
			dragStart = input.Position
			startPos = frame.Position
			input.Changed:Connect(function()
				if input.UserInputState == Enum.UserInputState.End then
					dragToggle = false
				end
			end)
		end
	end)
	
	UIS.InputChanged:Connect(function(input)
		if input.UserInputType == Enum.UserInputType.MouseMovement or input.UserInputType == Enum.UserInputType.Touch then
			if dragToggle then
				updateInput(input)
			end
		end
	end)
	
end
coroutine.wrap(ORBQV_fake_script)()
local function VFMD_fake_script() -- Set.LocalScript 
	local script = Instance.new('LocalScript', Set)

	script.Parent.MouseButton1Click:Connect(function()
		-- Gui to Lua
		-- Version: 3.2
	
		-- Instances:
	
		local SetWalkSpeed = Instance.new("ScreenGui")
		local Setm = Instance.new("Frame")
		local UICorner = Instance.new("UICorner")
		local Box = Instance.new("TextBox")
		local UICorner_2 = Instance.new("UICorner")
		local SetSpeed = Instance.new("TextButton")
		local UICorner_3 = Instance.new("UICorner")
		local SetJumpPower = Instance.new("TextButton")
		local UICorner_4 = Instance.new("UICorner")
		local Close = Instance.new("TextButton")
		local UICorner_5 = Instance.new("UICorner")
		local Label1 = Instance.new("TextLabel")
	
		--Properties:
	
		SetWalkSpeed.Name = "SetWalkSpeed"
		SetWalkSpeed.Parent = game.CoreGui
		SetWalkSpeed.ZIndexBehavior = Enum.ZIndexBehavior.Sibling
	
		Setm.Name = "Setm"
		Setm.Parent = SetWalkSpeed
		Setm.BackgroundColor3 = Color3.fromRGB(117, 117, 255)
		Setm.Position = UDim2.new(0.294947982, 0, 0.253846169, 0)
		Setm.Size = UDim2.new(0, 504, 0, 382)
	
		UICorner.Parent = Setm
	
		Box.Name = "Box"
		Box.Parent = Setm
		Box.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
		Box.Position = UDim2.new(0.0178638622, 0, 0.149910659, 0)
		Box.Size = UDim2.new(0, 485, 0, 50)
		Box.Font = Enum.Font.SourceSans
		Box.Text = ""
		Box.TextColor3 = Color3.fromRGB(0, 0, 0)
		Box.TextSize = 14.000
	
		UICorner_2.Parent = Box
	
		SetSpeed.Name = "SetSpeed"
		SetSpeed.Parent = Setm
		SetSpeed.BackgroundColor3 = Color3.fromRGB(117, 117, 117)
		SetSpeed.Position = UDim2.new(0.0178638622, 0, 0.329998761, 0)
		SetSpeed.Size = UDim2.new(0, 485, 0, 50)
		SetSpeed.Font = Enum.Font.SourceSans
		SetSpeed.Text = "Set WalkSpeed"
		SetSpeed.TextColor3 = Color3.fromRGB(255, 255, 255)
		SetSpeed.TextScaled = true
		SetSpeed.TextSize = 14.000
		SetSpeed.TextWrapped = true
	
		UICorner_3.Parent = SetSpeed
	
		SetJumpPower.Name = "SetJumpPower"
		SetJumpPower.Parent = Setm
		SetJumpPower.BackgroundColor3 = Color3.fromRGB(117, 117, 117)
		SetJumpPower.Position = UDim2.new(0.0178638622, 0, 0.503968239, 0)
		SetJumpPower.Size = UDim2.new(0, 485, 0, 50)
		SetJumpPower.Font = Enum.Font.SourceSans
		SetJumpPower.Text = "Set JumpPower"
		SetJumpPower.TextColor3 = Color3.fromRGB(255, 255, 255)
		SetJumpPower.TextScaled = true
		SetJumpPower.TextSize = 14.000
		SetJumpPower.TextWrapped = true
	
		UICorner_4.Parent = SetJumpPower
	
		Close.Name = "Close"
		Close.Parent = Setm
		Close.BackgroundColor3 = Color3.fromRGB(117, 117, 117)
		Close.Position = UDim2.new(0.0178638622, 0, 0.686019719, 0)
		Close.Size = UDim2.new(0, 485, 0, 50)
		Close.Font = Enum.Font.SourceSans
		Close.Text = "Close Gui"
		Close.TextColor3 = Color3.fromRGB(255, 255, 255)
		Close.TextScaled = true
		Close.TextSize = 14.000
		Close.TextWrapped = true
	
		UICorner_5.Parent = Close
	
		Label1.Name = "Label1"
		Label1.Parent = Setm
		Label1.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
		Label1.BackgroundTransparency = 1.000
		Label1.Position = UDim2.new(0.0376984142, 0, 0, 0)
		Label1.Size = UDim2.new(0, 466, 0, 50)
		Label1.Font = Enum.Font.SourceSans
		Label1.Text = "Set Speed&JumpPower"
		Label1.TextColor3 = Color3.fromRGB(255, 255, 255)
		Label1.TextScaled = true
		Label1.TextSize = 14.000
		Label1.TextWrapped = true
	
		-- Scripts:
	
		local function ZLNQD_fake_script() -- SetSpeed.LocalScript 
			local script = Instance.new('LocalScript', SetSpeed)
	
			local plr = game.Players.LocalPlayer
			local box = script.Parent.Parent.Box
	
			script.Parent.MouseButton1Click:Connect(function()
				plr.Character:WaitForChild("Humanoid").WalkSpeed = plr.Character:WaitForChild("Humanoid").WalkSpeed + box.Text
			end)
		end
		coroutine.wrap(ZLNQD_fake_script)()
		local function KPBLKU_fake_script() -- SetJumpPower.LocalScript 
			local script = Instance.new('LocalScript', SetJumpPower)
	
			local plr = game.Players.LocalPlayer
	
			script.Parent.MouseButton1Click:Connect(function()
				local box = script.Parent.Parent.Box
				plr.Character:WaitForChild("Humanoid").JumpPower = plr.Character:WaitForChild("Humanoid").JumpPower + box.Text
			end)
		end
		coroutine.wrap(KPBLKU_fake_script)()
		local function LTHWYG_fake_script() -- Close.LocalScript 
			local script = Instance.new('LocalScript', Close)
	
			script.Parent.MouseButton1Click:Connect(function()
				script.Parent.Parent.Parent.Setm.Visible = false
			end)
		end
		coroutine.wrap(LTHWYG_fake_script)()
		local function ZRFWI_fake_script() -- Label1.LocalScript 
			local script = Instance.new('LocalScript', Label1)
	
			local UIS = game:GetService('UserInputService')
			local frame = script.Parent.Parent.Parent.Setm
			local dragToggle = nil
			local dragSpeed = 0.25
			local dragStart = nil
			local startPos = nil
	
			local function updateInput(input)
				local delta = input.Position - dragStart
				local position = UDim2.new(startPos.X.Scale, startPos.X.Offset + delta.X,
					startPos.Y.Scale, startPos.Y.Offset + delta.Y)
				game:GetService('TweenService'):Create(frame, TweenInfo.new(dragSpeed), {Position = position}):Play()
			end
	
			frame.InputBegan:Connect(function(input)
				if (input.UserInputType == Enum.UserInputType.MouseButton1 or input.UserInputType == Enum.UserInputType.Touch) then 
					dragToggle = true
					dragStart = input.Position
					startPos = frame.Position
					input.Changed:Connect(function()
						if input.UserInputState == Enum.UserInputState.End then
							dragToggle = false
						end
					end)
				end
			end)
	
			UIS.InputChanged:Connect(function(input)
				if input.UserInputType == Enum.UserInputType.MouseMovement or input.UserInputType == Enum.UserInputType.Touch then
					if dragToggle then
						updateInput(input)
					end
				end
			end)
	
		end
		coroutine.wrap(ZRFWI_fake_script)()
		local function RGWGT_fake_script() -- SetWalkSpeed.LocalScript 
			local script = Instance.new('LocalScript', SetWalkSpeed)
	
			local UIS = game:GetService('UserInputService')
			local frame = script.Parent.Setm
			local dragToggle = nil
			local dragSpeed = 0.25
			local dragStart = nil
			local startPos = nil
	
			local function updateInput(input)
				local delta = input.Position - dragStart
				local position = UDim2.new(startPos.X.Scale, startPos.X.Offset + delta.X,
					startPos.Y.Scale, startPos.Y.Offset + delta.Y)
				game:GetService('TweenService'):Create(frame, TweenInfo.new(dragSpeed), {Position = position}):Play()
			end
	
			frame.InputBegan:Connect(function(input)
				if (input.UserInputType == Enum.UserInputType.MouseButton1 or input.UserInputType == Enum.UserInputType.Touch) then 
					dragToggle = true
					dragStart = input.Position
					startPos = frame.Position
					input.Changed:Connect(function()
						if input.UserInputState == Enum.UserInputState.End then
							dragToggle = false
						end
					end)
				end
			end)
	
			UIS.InputChanged:Connect(function(input)
				if input.UserInputType == Enum.UserInputType.MouseMovement or input.UserInputType == Enum.UserInputType.Touch then
					if dragToggle then
						updateInput(input)
					end
				end
			end)
	
		end
		coroutine.wrap(RGWGT_fake_script)()
	
	end)
end
coroutine.wrap(VFMD_fake_script)()
local function KNXRVXE_fake_script() -- ScriptHub.LocalScript 
	local script = Instance.new('LocalScript', ScriptHub)

	script.Parent.MouseButton1Click:Connect(function()
		-- Gui to Lua
		-- Version: 3.2
	
		-- Instances:
	
		local ScriptHub = Instance.new("ScreenGui")
		local ScriptHubFrame = Instance.new("Frame")
		local UICorner = Instance.new("UICorner")
		local InfinityYield = Instance.new("TextButton")
		local UICorner_2 = Instance.new("UICorner")
		local BedWars = Instance.new("TextButton")
		local UICorner_3 = Instance.new("UICorner")
		local ClientCommand = Instance.new("TextButton")
		local UICorner_4 = Instance.new("UICorner")
		local Counter = Instance.new("TextButton")
		local UICorner_5 = Instance.new("UICorner")
		local EnableReset = Instance.new("TextButton")
		local UICorner_6 = Instance.new("UICorner")
		local JailBreak = Instance.new("TextButton")
		local UICorner_7 = Instance.new("UICorner")
		local KingPiece = Instance.new("TextButton")
		local UICorner_8 = Instance.new("UICorner")
		local MyRest = Instance.new("TextButton")
		local UICorner_9 = Instance.new("UICorner")
		local PewtSim = Instance.new("TextButton")
		local UICorner_10 = Instance.new("UICorner")
		local AntiAfk = Instance.new("TextButton")
		local UICorner_11 = Instance.new("UICorner")
		local PrisonLife = Instance.new("TextButton")
		local UICorner_12 = Instance.new("UICorner")
		local Label2 = Instance.new("TextLabel")
		local Close = Instance.new("TextButton")
		local UICorner_13 = Instance.new("UICorner")
	
		--Properties:
	
		ScriptHub.Name = "ScriptHub"
		ScriptHub.Parent = game.CoreGui
		ScriptHub.ZIndexBehavior = Enum.ZIndexBehavior.Sibling
	
		ScriptHubFrame.Name = "ScriptHubFrame"
		ScriptHubFrame.Parent = ScriptHub
		ScriptHubFrame.BackgroundColor3 = Color3.fromRGB(117, 117, 255)
		ScriptHubFrame.Position = UDim2.new(0.367756307, 0, 0.229670346, 0)
		ScriptHubFrame.Size = UDim2.new(0, 488, 0, 559)
	
		UICorner.Parent = ScriptHubFrame
	
		InfinityYield.Name = "Infinity Yield"
		InfinityYield.Parent = ScriptHubFrame
		InfinityYield.BackgroundColor3 = Color3.fromRGB(117, 117, 117)
		InfinityYield.Position = UDim2.new(0.0389344245, 0, 0.157423973, 0)
		InfinityYield.Size = UDim2.new(0, 217, 0, 50)
		InfinityYield.Font = Enum.Font.SourceSans
		InfinityYield.Text = "Infinity Yield"
		InfinityYield.TextColor3 = Color3.fromRGB(255, 255, 255)
		InfinityYield.TextScaled = true
		InfinityYield.TextSize = 14.000
		InfinityYield.TextWrapped = true
	
		UICorner_2.Parent = InfinityYield
	
		BedWars.Name = "BedWars"
		BedWars.Parent = ScriptHubFrame
		BedWars.BackgroundColor3 = Color3.fromRGB(117, 117, 117)
		BedWars.Position = UDim2.new(0.510245919, 0, 0.157423973, 0)
		BedWars.Size = UDim2.new(0, 217, 0, 50)
		BedWars.Font = Enum.Font.SourceSans
		BedWars.Text = "BedWars(Vape V4)"
		BedWars.TextColor3 = Color3.fromRGB(255, 255, 255)
		BedWars.TextScaled = true
		BedWars.TextSize = 14.000
		BedWars.TextWrapped = true
	
		UICorner_3.Parent = BedWars
	
		ClientCommand.Name = "Client Command"
		ClientCommand.Parent = ScriptHubFrame
		ClientCommand.BackgroundColor3 = Color3.fromRGB(117, 117, 117)
		ClientCommand.Position = UDim2.new(0.0389344245, 0, 0.28264761, 0)
		ClientCommand.Size = UDim2.new(0, 217, 0, 50)
		ClientCommand.Font = Enum.Font.SourceSans
		ClientCommand.Text = "ClientCommand(FreeAdmin)"
		ClientCommand.TextColor3 = Color3.fromRGB(255, 255, 255)
		ClientCommand.TextScaled = true
		ClientCommand.TextSize = 14.000
		ClientCommand.TextWrapped = true
	
		UICorner_4.Parent = ClientCommand
	
		Counter.Name = "Counter"
		Counter.Parent = ScriptHubFrame
		Counter.BackgroundColor3 = Color3.fromRGB(117, 117, 117)
		Counter.Position = UDim2.new(0.512295127, 0, 0.28264761, 0)
		Counter.Size = UDim2.new(0, 217, 0, 50)
		Counter.Font = Enum.Font.SourceSans
		Counter.Text = "Counterblox"
		Counter.TextColor3 = Color3.fromRGB(255, 255, 255)
		Counter.TextScaled = true
		Counter.TextSize = 14.000
		Counter.TextWrapped = true
	
		UICorner_5.Parent = Counter
	
		EnableReset.Name = "Enable Reset"
		EnableReset.Parent = ScriptHubFrame
		EnableReset.BackgroundColor3 = Color3.fromRGB(117, 117, 117)
		EnableReset.Position = UDim2.new(0.0389344245, 0, 0.423971385, 0)
		EnableReset.Size = UDim2.new(0, 217, 0, 50)
		EnableReset.Font = Enum.Font.SourceSans
		EnableReset.Text = "Enable Reset"
		EnableReset.TextColor3 = Color3.fromRGB(255, 255, 255)
		EnableReset.TextScaled = true
		EnableReset.TextSize = 14.000
		EnableReset.TextWrapped = true
	
		UICorner_6.Parent = EnableReset
	
		JailBreak.Name = "JailBreak"
		JailBreak.Parent = ScriptHubFrame
		JailBreak.BackgroundColor3 = Color3.fromRGB(117, 117, 117)
		JailBreak.Position = UDim2.new(0.510245919, 0, 0.423971385, 0)
		JailBreak.Size = UDim2.new(0, 217, 0, 50)
		JailBreak.Font = Enum.Font.SourceSans
		JailBreak.Text = "JailBreak Gui"
		JailBreak.TextColor3 = Color3.fromRGB(255, 255, 255)
		JailBreak.TextScaled = true
		JailBreak.TextSize = 14.000
		JailBreak.TextWrapped = true
	
		UICorner_7.Parent = JailBreak
	
		KingPiece.Name = "King Piece"
		KingPiece.Parent = ScriptHubFrame
		KingPiece.BackgroundColor3 = Color3.fromRGB(117, 117, 117)
		KingPiece.Position = UDim2.new(0.0389344394, 0, 0.565295219, 0)
		KingPiece.Size = UDim2.new(0, 217, 0, 50)
		KingPiece.Font = Enum.Font.SourceSans
		KingPiece.Text = "King Legacy"
		KingPiece.TextColor3 = Color3.fromRGB(255, 255, 255)
		KingPiece.TextScaled = true
		KingPiece.TextSize = 14.000
		KingPiece.TextWrapped = true
	
		UICorner_8.Parent = KingPiece
	
		MyRest.Name = "My Rest"
		MyRest.Parent = ScriptHubFrame
		MyRest.BackgroundColor3 = Color3.fromRGB(117, 117, 117)
		MyRest.Position = UDim2.new(0.510245919, 0, 0.565295219, 0)
		MyRest.Size = UDim2.new(0, 217, 0, 50)
		MyRest.Font = Enum.Font.SourceSans
		MyRest.Text = "My Restaurant"
		MyRest.TextColor3 = Color3.fromRGB(255, 255, 255)
		MyRest.TextScaled = true
		MyRest.TextSize = 14.000
		MyRest.TextWrapped = true
	
		UICorner_9.Parent = MyRest
	
		PewtSim.Name = "PewtSim"
		PewtSim.Parent = ScriptHubFrame
		PewtSim.BackgroundColor3 = Color3.fromRGB(117, 117, 117)
		PewtSim.Position = UDim2.new(0.040983621, 0, 0.70483005, 0)
		PewtSim.Size = UDim2.new(0, 217, 0, 50)
		PewtSim.Font = Enum.Font.SourceSans
		PewtSim.Text = "PetSimulator"
		PewtSim.TextColor3 = Color3.fromRGB(255, 255, 255)
		PewtSim.TextScaled = true
		PewtSim.TextSize = 14.000
		PewtSim.TextWrapped = true
	
		UICorner_10.Parent = PewtSim
	
		AntiAfk.Name = "AntiAfk"
		AntiAfk.Parent = ScriptHubFrame
		AntiAfk.BackgroundColor3 = Color3.fromRGB(117, 117, 117)
		AntiAfk.Position = UDim2.new(0.510245919, 0, 0.70483005, 0)
		AntiAfk.Size = UDim2.new(0, 217, 0, 50)
		AntiAfk.Font = Enum.Font.SourceSans
		AntiAfk.Text = "AntiAfk"
		AntiAfk.TextColor3 = Color3.fromRGB(255, 255, 255)
		AntiAfk.TextScaled = true
		AntiAfk.TextSize = 14.000
		AntiAfk.TextWrapped = true
	
		UICorner_11.Parent = AntiAfk
	
		PrisonLife.Name = "Prison Life"
		PrisonLife.Parent = ScriptHubFrame
		PrisonLife.BackgroundColor3 = Color3.fromRGB(117, 117, 117)
		PrisonLife.Position = UDim2.new(0.0409836061, 0, 0.851520538, 0)
		PrisonLife.Size = UDim2.new(0, 447, 0, 50)
		PrisonLife.Font = Enum.Font.SourceSans
		PrisonLife.Text = "PrisonLife Gui"
		PrisonLife.TextColor3 = Color3.fromRGB(255, 255, 255)
		PrisonLife.TextScaled = true
		PrisonLife.TextSize = 14.000
		PrisonLife.TextWrapped = true
	
		UICorner_12.Parent = PrisonLife
	
		Label2.Name = "Label2"
		Label2.Parent = ScriptHubFrame
		Label2.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
		Label2.BackgroundTransparency = 1.000
		Label2.Position = UDim2.new(0, 10, 0, 11)
		Label2.Size = UDim2.new(0, 456, 0, 50)
		Label2.Font = Enum.Font.SourceSans
		Label2.Text = "ScriptHub Gui"
		Label2.TextColor3 = Color3.fromRGB(255, 255, 255)
		Label2.TextScaled = true
		Label2.TextSize = 14.000
		Label2.TextWrapped = true
	
		Close.Name = "Close"
		Close.Parent = ScriptHubFrame
		Close.BackgroundColor3 = Color3.fromRGB(117, 117, 117)
		Close.Position = UDim2.new(0.905737698, 0, 0, 0)
		Close.Size = UDim2.new(0, 46, 0, 47)
		Close.Font = Enum.Font.SourceSans
		Close.Text = "X"
		Close.TextColor3 = Color3.fromRGB(255, 255, 255)
		Close.TextScaled = true
		Close.TextSize = 14.000
		Close.TextWrapped = true
	
		UICorner_13.Parent = Close
	
		-- Scripts:
	
		local function NJLPG_fake_script() -- InfinityYield.LocalScript 
			local script = Instance.new('LocalScript', InfinityYield)
	
			script.Parent.MouseButton1Click:Connect(function()
				loadstring(game:HttpGet(('https://raw.githubusercontent.com/EdgeIY/infiniteyield/master/source'),true))()
			end)
		end
		coroutine.wrap(NJLPG_fake_script)()
		local function PRVXPE_fake_script() -- BedWars.LocalScript 
			local script = Instance.new('LocalScript', BedWars)
	
			script.Parent.MouseButton1Click:Connect(function()
				loadstring(game:HttpGet("https://raw.githubusercontent.com/7GrandDadPGN/VapeV4ForRoblox/main/NewMainScript.lua", true))()
			end)
		end
		coroutine.wrap(PRVXPE_fake_script)()
		local function NZLBQ_fake_script() -- ClientCommand.LocalScript 
			local script = Instance.new('LocalScript', ClientCommand)
	
	
	
			script.Parent.MouseButton1Click:Connect(function()
			--[[
			Hello this script was made by: Keng Vang
			What this script can do:
			Punish, and Silent CMD.
			this is in beta kinda i think. so if the
			Punish dosent work remember its in beta :D
		--]]
	
				local ScreenGui = Instance.new("ScreenGui")
				local Main = Instance.new("Frame")
				local Punish = Instance.new("TextButton")
				local SilentCMD = Instance.new("TextButton")
				local Box = Instance.new("TextBox")
				local X = Instance.new("TextButton")
	
				ScreenGui.Parent = game.Players.LocalPlayer:WaitForChild("PlayerGui")
				ScreenGui.ResetOnSpawn = false
	
				Main.Name = "Main"
				Main.Parent = ScreenGui
				Main.BackgroundColor3 = Color3.new(0.333333, 0.666667, 0.498039)
				Main.BorderSizePixel = 4
				Main.Position = UDim2.new(0.117575757, 0, 0.152334154, 0)
				Main.Size = UDim2.new(0, 334, 0, 138)
				Main.Active = true
				Main.Draggable = true
	
				Punish.Name = "Punish"
				Punish.Parent = Main
				Punish.BackgroundColor3 = Color3.new(0.168627, 0.513726, 0.25098)
				Punish.BorderColor3 = Color3.new(0.168627, 0.513726, 0.25098)
				Punish.Position = UDim2.new(0.0209580846, 0, 0.594202876, 0)
				Punish.Size = UDim2.new(0, 162, 0, 50)
				Punish.Font = Enum.Font.GothamBlack
				Punish.Text = "PUNISH"
				Punish.TextColor3 = Color3.new(1, 1, 1)
				Punish.TextSize = 14
				Punish.TextStrokeColor3 = Color3.new(1, 1, 1)
	
				SilentCMD.Name = "SilentCMD"
				SilentCMD.Parent = Main
				SilentCMD.BackgroundColor3 = Color3.new(0.168627, 0.513726, 0.25098)
				SilentCMD.BorderColor3 = Color3.new(0.168627, 0.513726, 0.25098)
				SilentCMD.Position = UDim2.new(0.514970064, 0, 0.594202876, 0)
				SilentCMD.Size = UDim2.new(0, 152, 0, 50)
				SilentCMD.Font = Enum.Font.Gotham
				SilentCMD.Text = "Silent CMD"
				SilentCMD.TextColor3 = Color3.new(1, 1, 1)
				SilentCMD.TextSize = 14
				SilentCMD.TextStrokeColor3 = Color3.new(1, 1, 1)
	
				Box.Name = "Box"
				Box.Parent = Main
				Box.BackgroundColor3 = Color3.new(0.168627, 0.513726, 0.25098)
				Box.BorderColor3 = Color3.new(0.168627, 0.513726, 0.25098)
				Box.Position = UDim2.new(0.0209580846, 0, 0.159420297, 0)
				Box.Size = UDim2.new(0, 317, 0, 50)
				Box.ClearTextOnFocus = false
				Box.Font = Enum.Font.SourceSans
				Box.PlaceholderColor3 = Color3.new(0.294118, 1, 0.764706)
				Box.PlaceholderText = "Enter Here"
				Box.Text = ""
				Box.TextColor3 = Color3.new(0.0235294, 1, 0.513726)
				Box.TextScaled = true
				Box.TextSize = 30
				Box.TextWrapped = true
	
				X.Name = "X"
				X.Parent = Main
				X.BackgroundColor3 = Color3.new(0.168627, 0.513726, 0.25098)
				X.BorderColor3 = Color3.new(0.168627, 0.513726, 0.25098)
				X.BorderSizePixel = 0
				X.Position = UDim2.new(0.952095807, 0, 0, 0)
				X.Size = UDim2.new(0, 16, 0, 16)
				X.Font = Enum.Font.SourceSans
				X.Text = "X"
				X.TextColor3 = Color3.new(1, 1, 1)
				X.TextScaled = true
				X.TextSize = 14
				X.TextWrapped = true
	
				--SCRIPTS
	
				local Players = game:GetService("Players")
				local LocalPlayer = Players.LocalPlayer
				local plrname = game.Players.LocalPlayer.Name
	
				local function RemoveSpaces(String)
					return String:gsub("%s+", "") or String
				end
	
				local function FindPlayer(String)
					String = RemoveSpaces(String)
					for _, _Player in pairs(Players:GetPlayers()) do
						if _Player.Name:lower():match('^'.. String:lower()) then
							return _Player
						end
					end
					return nil
				end
	
				Punish.MouseButton1Click:Connect(function()
					local target = FindPlayer(Box.Text)
					game.Players:Chat(":control "..target.Name.."")
					wait(1)
					game.Players:Chat(":control random")
					wait(1)
					game.Players:Chat(":ice me")
					wait(.5)
					game.Players:Chat(":control random")
					wait(1)
					game.Players:Chat(":freeze me")
					wait(1)
					game.Players:Chat(":control random")
					wait(.5)
					game.Players:Chat(":ice "..plrname.."")
					wait(1)
					game.Players:Chat(":control random")
					wait(.5)
					game.Players:Chat(":explode me")
					wait(1)
					game.Players:Chat(":control random")
					wait(1)
					game.Players:Chat(":unice me")
				end)
	
				SilentCMD.MouseButton1Click:Connect(function()
					game.Players:Chat(Box.Text)
					game.Players:Chat(":"..Box.Text.."")
				end)
	
				X.MouseButton1Click:Connect(function()
					ScreenGui:Destroy()
				end)
	
			end)
		end
		coroutine.wrap(NZLBQ_fake_script)()
		local function EKFBSNY_fake_script() -- Counter.LocalScript 
			local script = Instance.new('LocalScript', Counter)
	
			script.Parent.MouseButton1Click:Connect(function()
				loadstring(game:HttpGet('https://raw.githubusercontent.com/venosu/Hex-Hub/main/hexhub.lua'))()
			end)
		end
		coroutine.wrap(EKFBSNY_fake_script)()
		local function DZBVX_fake_script() -- EnableReset.LocalScript 
			local script = Instance.new('LocalScript', EnableReset)
	
		--[[
		     Enable Reset Character
		     By: OpenGamerTips
		
		     NOTE:
		     This script enables the abillity to reset your character, but this script executes the enabler every split second.
		     Do not execute the script again, as it will stress your script executor.
		]]--
	
			while true do
				game:GetService("StarterGui"):SetCore("ResetButtonCallback", true)
				game:GetService("RunService").RenderStepped:Wait()
			end
	
		end
		coroutine.wrap(DZBVX_fake_script)()
		local function VUHHO_fake_script() -- JailBreak.LocalScript 
			local script = Instance.new('LocalScript', JailBreak)
	
			script.Parent.MouseButton1Click:Connect(function()
				loadstring(game:HttpGet("https://raw.githubusercontent.com/RegularVynixu/Vynixius/main/Jailbreak/Script.lua"))()
			end)
		end
		coroutine.wrap(VUHHO_fake_script)()
		local function ABRYA_fake_script() -- KingPiece.LocalScript 
			local script = Instance.new('LocalScript', KingPiece)
	
			script.Parent.MouseButton1Click:Connect(function()
				loadstring(game:HttpGet("https://raw.githubusercontent.com/sannin9000/scripts/main/kinglegacy.lua"))()
	
			end)
		end
		coroutine.wrap(ABRYA_fake_script)()
		local function MUUJAON_fake_script() -- MyRest.LocalScript 
			local script = Instance.new('LocalScript', MyRest)
	
			script.Parent.MouseButton1Click:Connect(function()
				loadstring(game:HttpGet("http://void-scripts.com/Scripts/myRest.lua"))()
	
			end)
		end
		coroutine.wrap(MUUJAON_fake_script)()
		local function RKOKC_fake_script() -- PewtSim.LocalScript 
			local script = Instance.new('LocalScript', PewtSim)
	
			script.Parent.MouseButton1Click:Connect(function()
				loadstring(game:HttpGet("https://raw.githubusercontent.com/hackerDashDash/PetSimulatorX/main/HugeCatsObfuscated.lua",true))()
			end)
		end
		coroutine.wrap(RKOKC_fake_script)()
		local function ALHPZL_fake_script() -- AntiAfk.LocalScript 
			local script = Instance.new('LocalScript', AntiAfk)
	
	
	
			script.Parent.MouseButton1Click:Connect(function()
				local vu = game:GetService("VirtualUser")
				game:GetService("Players").LocalPlayer.Idled:connect(function()
					vu:Button2Down(Vector2.new(0,0),workspace.CurrentCamera.CFrame)
					wait(1)
					vu:Button2Up(Vector2.new(0,0),workspace.CurrentCamera.CFrame)
				end)
			end)
		end
		coroutine.wrap(ALHPZL_fake_script)()
		local function HXPEV_fake_script() -- PrisonLife.LocalScript 
			local script = Instance.new('LocalScript', PrisonLife)
	
			script.Parent.MouseButton1Click:Connect(function()
				loadstring(game:HttpGet(('https://pastebin.com/bAPD4epE'),true))()
			end)
		end
		coroutine.wrap(HXPEV_fake_script)()
		local function CZAH_fake_script() -- Label2.LocalScript 
			local script = Instance.new('LocalScript', Label2)
	
			local UIS = game:GetService('UserInputService')
			local frame = script.Parent.Parent.Parent.ScriptHubFrame
			local dragToggle = nil
			local dragSpeed = 0.25
			local dragStart = nil
			local startPos = nil
	
			local function updateInput(input)
				local delta = input.Position - dragStart
				local position = UDim2.new(startPos.X.Scale, startPos.X.Offset + delta.X,
					startPos.Y.Scale, startPos.Y.Offset + delta.Y)
				game:GetService('TweenService'):Create(frame, TweenInfo.new(dragSpeed), {Position = position}):Play()
			end
	
			frame.InputBegan:Connect(function(input)
				if (input.UserInputType == Enum.UserInputType.MouseButton1 or input.UserInputType == Enum.UserInputType.Touch) then 
					dragToggle = true
					dragStart = input.Position
					startPos = frame.Position
					input.Changed:Connect(function()
						if input.UserInputState == Enum.UserInputState.End then
							dragToggle = false
						end
					end)
				end
			end)
	
			UIS.InputChanged:Connect(function(input)
				if input.UserInputType == Enum.UserInputType.MouseMovement or input.UserInputType == Enum.UserInputType.Touch then
					if dragToggle then
						updateInput(input)
					end
				end
			end)
	
		end
		coroutine.wrap(CZAH_fake_script)()
		local function WUEEHQ_fake_script() -- Close.LocalScript 
			local script = Instance.new('LocalScript', Close)
	
			script.Parent.MouseButton1Click:Connect(function()
				script.Parent.Parent.Parent.ScriptHubFrame.Visible = false
				game.StarterGui:SetCore("SendNotification", {Title = "Closed!", Text = "Closed ScriptHub Gui!"})
			end)
		end
		coroutine.wrap(WUEEHQ_fake_script)()
		local function NMDHCV_fake_script() -- ScriptHub.LocalScript 
			local script = Instance.new('LocalScript', ScriptHub)
	
			local UIS = game:GetService('UserInputService')
			local frame = script.Parent.ScriptHubFrame
			local dragToggle = nil
			local dragSpeed = 0.25
			local dragStart = nil
			local startPos = nil
	
			local function updateInput(input)
				local delta = input.Position - dragStart
				local position = UDim2.new(startPos.X.Scale, startPos.X.Offset + delta.X,
					startPos.Y.Scale, startPos.Y.Offset + delta.Y)
				game:GetService('TweenService'):Create(frame, TweenInfo.new(dragSpeed), {Position = position}):Play()
			end
	
			frame.InputBegan:Connect(function(input)
				if (input.UserInputType == Enum.UserInputType.MouseButton1 or input.UserInputType == Enum.UserInputType.Touch) then 
					dragToggle = true
					dragStart = input.Position
					startPos = frame.Position
					input.Changed:Connect(function()
						if input.UserInputState == Enum.UserInputState.End then
							dragToggle = false
						end
					end)
				end
			end)
	
			UIS.InputChanged:Connect(function(input)
				if input.UserInputType == Enum.UserInputType.MouseMovement or input.UserInputType == Enum.UserInputType.Touch then
					if dragToggle then
						updateInput(input)
					end
				end
			end)
	
		end
		coroutine.wrap(NMDHCV_fake_script)()
	
	end)
end
coroutine.wrap(KNXRVXE_fake_script)()
local function YLOTSI_fake_script() -- Script2.LocalScript 
	local script = Instance.new('LocalScript', Script2)

	script.Parent.MouseButton1Click:Connect(function()
		-- Gui to Lua
		-- Version: 3.2
	
		-- Instances:
	
		local Page2 = Instance.new("ScreenGui")
		local ScriptHubPage2 = Instance.new("Frame")
		local UICorner = Instance.new("UICorner")
		local OPGun = Instance.new("TextButton")
		local UICorner_2 = Instance.new("UICorner")
		local OwlHub = Instance.new("TextButton")
		local UICorner_3 = Instance.new("UICorner")
		local Label3 = Instance.new("TextLabel")
		local Close = Instance.new("TextButton")
		local UICorner_4 = Instance.new("UICorner")
	
		--Properties:
	
		Page2.Name = "Page 2"
		Page2.Parent = game.CoreGui
		Page2.ZIndexBehavior = Enum.ZIndexBehavior.Sibling
	
		ScriptHubPage2.Name = "ScriptHub Page2"
		ScriptHubPage2.Parent = Page2
		ScriptHubPage2.BackgroundColor3 = Color3.fromRGB(117, 117, 255)
		ScriptHubPage2.Position = UDim2.new(0.367756307, 0, 0.229670346, 0)
		ScriptHubPage2.Size = UDim2.new(0, 488, 0, 559)
	
		UICorner.Parent = ScriptHubPage2
	
		OPGun.Name = "OPGun"
		OPGun.Parent = ScriptHubPage2
		OPGun.BackgroundColor3 = Color3.fromRGB(117, 117, 117)
		OPGun.Position = UDim2.new(0.0389344245, 0, 0.157423973, 0)
		OPGun.Size = UDim2.new(0, 447, 0, 50)
		OPGun.Font = Enum.Font.SourceSans
		OPGun.Text = "OP GUN(Prison Life)"
		OPGun.TextColor3 = Color3.fromRGB(255, 255, 255)
		OPGun.TextScaled = true
		OPGun.TextSize = 14.000
		OPGun.TextWrapped = true
	
		UICorner_2.Parent = OPGun
	
		OwlHub.Name = "OwlHub"
		OwlHub.Parent = ScriptHubPage2
		OwlHub.BackgroundColor3 = Color3.fromRGB(117, 117, 117)
		OwlHub.Position = UDim2.new(0.0389344245, 0, 0.280858666, 0)
		OwlHub.Size = UDim2.new(0, 447, 0, 50)
		OwlHub.Font = Enum.Font.SourceSans
		OwlHub.Text = "OwlHub(General)"
		OwlHub.TextColor3 = Color3.fromRGB(255, 255, 255)
		OwlHub.TextScaled = true
		OwlHub.TextSize = 14.000
		OwlHub.TextWrapped = true
	
		UICorner_3.Parent = OwlHub
	
		Label3.Name = "Label3"
		Label3.Parent = ScriptHubPage2
		Label3.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
		Label3.BackgroundTransparency = 1.000
		Label3.Position = UDim2.new(0, 10, 0, 11)
		Label3.Size = UDim2.new(0, 456, 0, 50)
		Label3.Font = Enum.Font.SourceSans
		Label3.Text = "ScriptHub Page2"
		Label3.TextColor3 = Color3.fromRGB(255, 255, 255)
		Label3.TextScaled = true
		Label3.TextSize = 14.000
		Label3.TextWrapped = true
	
		Close.Name = "Close"
		Close.Parent = ScriptHubPage2
		Close.BackgroundColor3 = Color3.fromRGB(117, 117, 117)
		Close.Position = UDim2.new(0.905737698, 0, 0, 0)
		Close.Size = UDim2.new(0, 46, 0, 47)
		Close.Font = Enum.Font.SourceSans
		Close.Text = "X"
		Close.TextColor3 = Color3.fromRGB(255, 255, 255)
		Close.TextScaled = true
		Close.TextSize = 14.000
		Close.TextWrapped = true
	
		UICorner_4.Parent = Close
	
		-- Scripts:
	
		local function OOAUCWD_fake_script() -- OPGun.LocalScript 
			local script = Instance.new('LocalScript', OPGun)
	
			script.Parent.MouseButton1Click:Connect(function()
				local gun = require(game.Players.LocalPlayer.Character:FindFirstChildOfClass('Tool').GunStates)
				gun.AutoFire = true
				gun.MaxAmmo = math.huge
				gun.CurrentAmmo = math.huge
				gun.ReloadTime = 0
				gun.FireRate = math.huge
				gun.Damage = 100
				gun.Spread = 5
			end)
		end
		coroutine.wrap(OOAUCWD_fake_script)()
		local function TJUN_fake_script() -- OwlHub.LocalScript 
			local script = Instance.new('LocalScript', OwlHub)
	
			script.Parent.MouseButton1Click:Connect(function()
				loadstring(game:HttpGet("https://raw.githubusercontent.com/CriShoux/OwlHub/master/OwlHub.txt"))();
			end)
		end
		coroutine.wrap(TJUN_fake_script)()
		local function LAUJLZI_fake_script() -- Label3.LocalScript 
			local script = Instance.new('LocalScript', Label3)
	
			local UIS = game:GetService('UserInputService')
			local frame = script.Parent.Parent.Parent.ScriptHubFrame
			local dragToggle = nil
			local dragSpeed = 0.25
			local dragStart = nil
			local startPos = nil
	
			local function updateInput(input)
				local delta = input.Position - dragStart
				local position = UDim2.new(startPos.X.Scale, startPos.X.Offset + delta.X,
					startPos.Y.Scale, startPos.Y.Offset + delta.Y)
				game:GetService('TweenService'):Create(frame, TweenInfo.new(dragSpeed), {Position = position}):Play()
			end
	
			frame.InputBegan:Connect(function(input)
				if (input.UserInputType == Enum.UserInputType.MouseButton1 or input.UserInputType == Enum.UserInputType.Touch) then 
					dragToggle = true
					dragStart = input.Position
					startPos = frame.Position
					input.Changed:Connect(function()
						if input.UserInputState == Enum.UserInputState.End then
							dragToggle = false
						end
					end)
				end
			end)
	
			UIS.InputChanged:Connect(function(input)
				if input.UserInputType == Enum.UserInputType.MouseMovement or input.UserInputType == Enum.UserInputType.Touch then
					if dragToggle then
						updateInput(input)
					end
				end
			end)
	
		end
		coroutine.wrap(LAUJLZI_fake_script)()
		local function FAFO_fake_script() -- Close.LocalScript 
			local script = Instance.new('LocalScript', Close)
	
			script.Parent.MouseButton1Click:Connect(function()
				script.Parent.Parent.Parent["ScriptHub Page2"].Visible = false
				game.StarterGui:SetCore("SendNotification", {Title = "Closed!", Text = "Closed ScriptHub Gui!"})
			end)
		end
		coroutine.wrap(FAFO_fake_script)()
		local function FISFQLN_fake_script() -- Page2.Draggable 
			local script = Instance.new('LocalScript', Page2)
	
			local UIS = game:GetService('UserInputService')
			local frame = script.Parent["ScriptHub Page2"]
			local dragToggle = nil
			local dragSpeed = 0.25
			local dragStart = nil
			local startPos = nil
	
			local function updateInput(input)
				local delta = input.Position - dragStart
				local position = UDim2.new(startPos.X.Scale, startPos.X.Offset + delta.X,
					startPos.Y.Scale, startPos.Y.Offset + delta.Y)
				game:GetService('TweenService'):Create(frame, TweenInfo.new(dragSpeed), {Position = position}):Play()
			end
	
			frame.InputBegan:Connect(function(input)
				if (input.UserInputType == Enum.UserInputType.MouseButton1 or input.UserInputType == Enum.UserInputType.Touch) then 
					dragToggle = true
					dragStart = input.Position
					startPos = frame.Position
					input.Changed:Connect(function()
						if input.UserInputState == Enum.UserInputState.End then
							dragToggle = false
						end
					end)
				end
			end)
	
			UIS.InputChanged:Connect(function(input)
				if input.UserInputType == Enum.UserInputType.MouseMovement or input.UserInputType == Enum.UserInputType.Touch then
					if dragToggle then
						updateInput(input)
					end
				end
			end)
	
		end
		coroutine.wrap(FISFQLN_fake_script)()
	
	end)
end
coroutine.wrap(YLOTSI_fake_script)()
local function ASSXKQJ_fake_script() -- Maded.LocalScript 
	local script = Instance.new('LocalScript', Maded)

	script.Parent.MouseButton1Click:Connect(function()
		game.StarterGui:SetCore("SendNotification", {Title = "Edition Or Script", Text = "Loaded JavaScript, Loaded JavaEdition"})
		game.StarterGui:SetCore("SendNotification", {Title = "Simple Ui Loaded.", Text = "This is Allowed For All so this is Simple UI Of Once Key if you died for you need get key again."})
	end)
end
coroutine.wrap(ASSXKQJ_fake_script)()
local function QFXW_fake_script() -- Shutdown.LocalScript 
	local script = Instance.new('LocalScript', Shutdown)

	local plr = game.Players.LocalPlayer
	
	script.Parent.MouseButton1Click:Connect(function()
		if plr.Name == "john_doe575757" then
			game.StarterGui:SetCore("SendNotification", {Title = "Welcome!", Text = "Welcome! Developer JohnDoe!"})
			-- Gui to Lua
			-- Version: 3.2
	
			-- Instances:
	
			local DarkGui = Instance.new("ScreenGui")
			local DarGui = Instance.new("Frame")
			local UICorner = Instance.new("UICorner")
			local Box = Instance.new("TextBox")
			local UICorner_2 = Instance.new("UICorner")
			local TextLabel = Instance.new("TextLabel")
			local CheckKey = Instance.new("TextButton")
			local UICorner_3 = Instance.new("UICorner")
			local GetKey = Instance.new("TextButton")
			local UICorner_4 = Instance.new("UICorner")
			local Bypass = Instance.new("TextButton")
			local UICorner_5 = Instance.new("UICorner")
			local Close = Instance.new("TextButton")
			local UICorner_6 = Instance.new("UICorner")
			local Verify = Instance.new("Frame")
			local UICorner_7 = Instance.new("UICorner")
			local Box_2 = Instance.new("TextBox")
			local UICorner_8 = Instance.new("UICorner")
			local TextLabel_2 = Instance.new("TextLabel")
			local Check = Instance.new("TextButton")
			local UICorner_9 = Instance.new("UICorner")
			local tct = Instance.new("TextLabel")
			local GetKey_2 = Instance.new("Frame")
			local UICorner_10 = Instance.new("UICorner")
			local TextLabel_3 = Instance.new("TextLabel")
			local Copy = Instance.new("TextButton")
			local UICorner_11 = Instance.new("UICorner")
			local tct_2 = Instance.new("TextLabel")
			local returnbutton = Instance.new("TextButton")
			local UICorner_12 = Instance.new("UICorner")
			local ShutdownGui = Instance.new("Frame")
			local UICorner_13 = Instance.new("UICorner")
			local TextLabel_4 = Instance.new("TextLabel")
			local execute = Instance.new("TextButton")
			local UICorner_14 = Instance.new("UICorner")
			local TextBox = Instance.new("TextBox")
	
			--Properties:
	
			DarkGui.Name = "DarkGui"
			DarkGui.Parent = game.CoreGui
			DarkGui.ZIndexBehavior = Enum.ZIndexBehavior.Sibling
	
			DarGui.Name = "DarGui"
			DarGui.Parent = DarkGui
			DarGui.BackgroundColor3 = Color3.fromRGB(76, 76, 76)
			DarGui.Position = UDim2.new(0.31728667, 0, 0.226373628, 0)
			DarGui.Size = UDim2.new(0, 646, 0, 514)
	
			UICorner.Parent = DarGui
	
			Box.Name = "Box"
			Box.Parent = DarGui
			Box.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
			Box.Position = UDim2.new(0.0882352963, 0, 0.266536951, 0)
			Box.Size = UDim2.new(0, 531, 0, 60)
			Box.Font = Enum.Font.SourceSans
			Box.Text = ""
			Box.TextColor3 = Color3.fromRGB(0, 0, 0)
			Box.TextScaled = true
			Box.TextSize = 14.000
			Box.TextWrapped = true
	
			UICorner_2.Parent = Box
	
			TextLabel.Parent = DarGui
			TextLabel.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
			TextLabel.BackgroundTransparency = 1.000
			TextLabel.Position = UDim2.new(0.0371517017, 0, 0.0291828793, 0)
			TextLabel.Size = UDim2.new(0, 601, 0, 87)
			TextLabel.Font = Enum.Font.SourceSans
			TextLabel.Text = "DarkGui KeySystem"
			TextLabel.TextColor3 = Color3.fromRGB(255, 255, 255)
			TextLabel.TextScaled = true
			TextLabel.TextSize = 14.000
			TextLabel.TextWrapped = true
	
			CheckKey.Name = "Check Key"
			CheckKey.Parent = DarGui
			CheckKey.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
			CheckKey.Position = UDim2.new(0.0882352963, 0, 0.424124509, 0)
			CheckKey.Size = UDim2.new(0, 531, 0, 50)
			CheckKey.Font = Enum.Font.SourceSans
			CheckKey.Text = "Check Key"
			CheckKey.TextColor3 = Color3.fromRGB(255, 255, 255)
			CheckKey.TextScaled = true
			CheckKey.TextSize = 14.000
			CheckKey.TextWrapped = true
	
			UICorner_3.Parent = CheckKey
	
			GetKey.Name = "Get Key"
			GetKey.Parent = DarGui
			GetKey.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
			GetKey.Position = UDim2.new(0.0882352963, 0, 0.560311258, 0)
			GetKey.Size = UDim2.new(0, 531, 0, 50)
			GetKey.Font = Enum.Font.SourceSans
			GetKey.Text = "No Has Key? Get Once Key!"
			GetKey.TextColor3 = Color3.fromRGB(255, 255, 255)
			GetKey.TextScaled = true
			GetKey.TextSize = 14.000
			GetKey.TextWrapped = true
	
			UICorner_4.Parent = GetKey
	
			Bypass.Name = "Bypass"
			Bypass.Parent = DarGui
			Bypass.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
			Bypass.Position = UDim2.new(0.0882352963, 0, 0.696498036, 0)
			Bypass.Size = UDim2.new(0, 531, 0, 50)
			Bypass.Font = Enum.Font.SourceSans
			Bypass.Text = "Speical Account Bypass"
			Bypass.TextColor3 = Color3.fromRGB(255, 255, 255)
			Bypass.TextScaled = true
			Bypass.TextSize = 14.000
			Bypass.TextWrapped = true
	
			UICorner_5.Parent = Bypass
	
			Close.Name = "Close"
			Close.Parent = DarGui
			Close.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
			Close.Position = UDim2.new(0.0913312733, 0, 0.83073926, 0)
			Close.Size = UDim2.new(0, 531, 0, 50)
			Close.Font = Enum.Font.SourceSans
			Close.Text = "Close DarkGui"
			Close.TextColor3 = Color3.fromRGB(255, 255, 255)
			Close.TextScaled = true
			Close.TextSize = 14.000
			Close.TextWrapped = true
	
			UICorner_6.Parent = Close
	
			Verify.Name = "Verify"
			Verify.Parent = DarkGui
			Verify.BackgroundColor3 = Color3.fromRGB(76, 76, 76)
			Verify.Position = UDim2.new(0.31728667, 0, 0.226373628, 0)
			Verify.Size = UDim2.new(0, 646, 0, 514)
			Verify.Visible = false
	
			UICorner_7.Parent = Verify
	
			Box_2.Name = "Box"
			Box_2.Parent = Verify
			Box_2.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
			Box_2.Position = UDim2.new(0.0882352963, 0, 0.383268476, 0)
			Box_2.Size = UDim2.new(0, 531, 0, 60)
			Box_2.Font = Enum.Font.SourceSans
			Box_2.Text = ""
			Box_2.TextColor3 = Color3.fromRGB(0, 0, 0)
			Box_2.TextScaled = true
			Box_2.TextSize = 14.000
			Box_2.TextWrapped = true
	
			UICorner_8.Parent = Box_2
	
			TextLabel_2.Parent = Verify
			TextLabel_2.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
			TextLabel_2.BackgroundTransparency = 1.000
			TextLabel_2.Position = UDim2.new(0.0371517017, 0, 0.0291828793, 0)
			TextLabel_2.Size = UDim2.new(0, 601, 0, 87)
			TextLabel_2.Font = Enum.Font.SourceSans
			TextLabel_2.Text = "DarkGui KeySystem"
			TextLabel_2.TextColor3 = Color3.fromRGB(255, 255, 255)
			TextLabel_2.TextScaled = true
			TextLabel_2.TextSize = 14.000
			TextLabel_2.TextWrapped = true
	
			Check.Name = "Check"
			Check.Parent = Verify
			Check.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
			Check.Position = UDim2.new(0.0882352963, 0, 0.560311258, 0)
			Check.Size = UDim2.new(0, 531, 0, 50)
			Check.Font = Enum.Font.SourceSans
			Check.Text = "Check Key"
			Check.TextColor3 = Color3.fromRGB(255, 255, 255)
			Check.TextScaled = true
			Check.TextSize = 14.000
			Check.TextWrapped = true
	
			UICorner_9.Parent = Check
	
			tct.Name = "tct"
			tct.Parent = Verify
			tct.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
			tct.BackgroundTransparency = 1.000
			tct.Position = UDim2.new(0.0340557247, 0, 0.186770424, 0)
			tct.Size = UDim2.new(0, 601, 0, 87)
			tct.Font = Enum.Font.SourceSans
			tct.Text = "fgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngi"
			tct.TextColor3 = Color3.fromRGB(255, 255, 255)
			tct.TextScaled = true
			tct.TextSize = 14.000
			tct.TextWrapped = true
	
			GetKey_2.Name = "GetKey"
			GetKey_2.Parent = DarkGui
			GetKey_2.BackgroundColor3 = Color3.fromRGB(76, 76, 76)
			GetKey_2.Position = UDim2.new(0.318016052, 0, 0.226373628, 0)
			GetKey_2.Size = UDim2.new(0, 646, 0, 514)
			GetKey_2.Visible = false
	
			UICorner_10.Parent = GetKey_2
	
			TextLabel_3.Parent = GetKey_2
			TextLabel_3.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
			TextLabel_3.BackgroundTransparency = 1.000
			TextLabel_3.Position = UDim2.new(0.0371517017, 0, 0.0291828793, 0)
			TextLabel_3.Size = UDim2.new(0, 601, 0, 87)
			TextLabel_3.Font = Enum.Font.SourceSans
			TextLabel_3.Text = "DarkGui - Key"
			TextLabel_3.TextColor3 = Color3.fromRGB(255, 255, 255)
			TextLabel_3.TextScaled = true
			TextLabel_3.TextSize = 14.000
			TextLabel_3.TextWrapped = true
	
			Copy.Name = "Copy"
			Copy.Parent = GetKey_2
			Copy.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
			Copy.Position = UDim2.new(0.0866873115, 0, 0.49999997, 0)
			Copy.Size = UDim2.new(0, 531, 0, 50)
			Copy.Font = Enum.Font.SourceSans
			Copy.Text = "Copy Key"
			Copy.TextColor3 = Color3.fromRGB(255, 255, 255)
			Copy.TextScaled = true
			Copy.TextSize = 14.000
			Copy.TextWrapped = true
	
			UICorner_11.Parent = Copy
	
			tct_2.Name = "tct"
			tct_2.Parent = GetKey_2
			tct_2.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
			tct_2.BackgroundTransparency = 1.000
			tct_2.Position = UDim2.new(0.0325077362, 0, 0.266536951, 0)
			tct_2.Size = UDim2.new(0, 601, 0, 87)
			tct_2.Font = Enum.Font.SourceSans
			tct_2.Text = "dfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtgu"
			tct_2.TextColor3 = Color3.fromRGB(255, 255, 255)
			tct_2.TextScaled = true
			tct_2.TextSize = 14.000
			tct_2.TextWrapped = true
	
			returnbutton.Name = "returnbutton"
			returnbutton.Parent = GetKey_2
			returnbutton.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
			returnbutton.Position = UDim2.new(0.0866873115, 0, 0.645914376, 0)
			returnbutton.Size = UDim2.new(0, 531, 0, 50)
			returnbutton.Font = Enum.Font.SourceSans
			returnbutton.Text = "Return To Use Key"
			returnbutton.TextColor3 = Color3.fromRGB(255, 255, 255)
			returnbutton.TextScaled = true
			returnbutton.TextSize = 14.000
			returnbutton.TextWrapped = true
	
			UICorner_12.Parent = returnbutton
	
			ShutdownGui.Name = "Shutdown Gui"
			ShutdownGui.Parent = DarkGui
			ShutdownGui.BackgroundColor3 = Color3.fromRGB(76, 76, 76)
			ShutdownGui.Position = UDim2.new(0.31728667, 0, 0.226373628, 0)
			ShutdownGui.Size = UDim2.new(0, 646, 0, 514)
			ShutdownGui.Visible = false
	
			UICorner_13.Parent = ShutdownGui
	
			TextLabel_4.Parent = ShutdownGui
			TextLabel_4.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
			TextLabel_4.BackgroundTransparency = 1.000
			TextLabel_4.Position = UDim2.new(0.0510835908, 0, 0.0525291823, 0)
			TextLabel_4.Size = UDim2.new(0, 601, 0, 87)
			TextLabel_4.Font = Enum.Font.SourceSans
			TextLabel_4.Text = "DarkGui - Shutdown Panel"
			TextLabel_4.TextColor3 = Color3.fromRGB(255, 255, 255)
			TextLabel_4.TextScaled = true
			TextLabel_4.TextSize = 14.000
			TextLabel_4.TextWrapped = true
	
			execute.Name = "execute"
			execute.Parent = ShutdownGui
			execute.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
			execute.Position = UDim2.new(0.0882352963, 0, 0.575875461, 0)
			execute.Size = UDim2.new(0, 531, 0, 50)
			execute.Font = Enum.Font.SourceSans
			execute.Text = "Shutdown Start"
			execute.TextColor3 = Color3.fromRGB(255, 255, 255)
			execute.TextScaled = true
			execute.TextSize = 14.000
			execute.TextWrapped = true
	
			UICorner_14.Parent = execute
	
			TextBox.Parent = ShutdownGui
			TextBox.BackgroundColor3 = Color3.fromRGB(109, 109, 109)
			TextBox.Position = UDim2.new(0.0681114569, 0, 0.266536951, 0)
			TextBox.Size = UDim2.new(0, 565, 0, 98)
			TextBox.Font = Enum.Font.SourceSans
			TextBox.Text = "Reason Here"
			TextBox.TextColor3 = Color3.fromRGB(255, 255, 255)
			TextBox.TextScaled = true
			TextBox.TextSize = 14.000
			TextBox.TextWrapped = true
	
			-- Scripts:
	
			local function TBXHMRS_fake_script() -- DarGui.Draggable 
				local script = Instance.new('LocalScript', DarGui)
	
				local UIS = game:GetService('UserInputService')
				local frame = script.Parent.Parent.DarGui
				local dragToggle = nil
				local dragSpeed = 0.25
				local dragStart = nil
				local startPos = nil
	
				local function updateInput(input)
					local delta = input.Position - dragStart
					local position = UDim2.new(startPos.X.Scale, startPos.X.Offset + delta.X,
						startPos.Y.Scale, startPos.Y.Offset + delta.Y)
					game:GetService('TweenService'):Create(frame, TweenInfo.new(dragSpeed), {Position = position}):Play()
				end
	
				frame.InputBegan:Connect(function(input)
					if (input.UserInputType == Enum.UserInputType.MouseButton1 or input.UserInputType == Enum.UserInputType.Touch) then 
						dragToggle = true
						dragStart = input.Position
						startPos = frame.Position
						input.Changed:Connect(function()
							if input.UserInputState == Enum.UserInputState.End then
								dragToggle = false
							end
						end)
					end
				end)
	
				UIS.InputChanged:Connect(function(input)
					if input.UserInputType == Enum.UserInputType.MouseMovement or input.UserInputType == Enum.UserInputType.Touch then
						if dragToggle then
							updateInput(input)
						end
					end
				end)
	
			end
			coroutine.wrap(TBXHMRS_fake_script)()
			local function LKFXV_fake_script() -- CheckKey.LocalScript 
				local script = Instance.new('LocalScript', CheckKey)
	
				script.Parent.MouseButton1Click:Connect(function()
					if script.Parent.Parent.Box.Text == script.Parent.Parent.Parent.GetKey.tct.Text then
						game.StarterGui:SetCore("SendNotification", {Title = "Correct!", Text = "Correct Key!"})
						local gui = script.Parent.Parent.Parent["Shutdown Gui"]
						gui.Visible = true
						script.Parent.Parent.Parent.DarGui.Visible = false
					else
						game.StarterGui:SetCore("SendNotification", {Title = "Failed :(", Text = "Invaild Key."})
					end
				end)
			end
			coroutine.wrap(LKFXV_fake_script)()
			local function QKFUG_fake_script() -- GetKey.LocalScript 
				local script = Instance.new('LocalScript', GetKey)
	
				script.Parent.MouseButton1Click:Connect(function()
					script.Parent.Parent.Parent.DarGui.Visible = false
					script.Parent.Parent.Parent.Verify.Visible = true
				end)
			end
			coroutine.wrap(QKFUG_fake_script)()
			local function SPDQNWU_fake_script() -- Bypass.LocalScript 
				local script = Instance.new('LocalScript', Bypass)
	
				local plr = game.Players.LocalPlayer
	
				script.Parent.MouseButton1Click:Connect(function()
					local gui = script.Parent.Parent.Parent["Shutdown Gui"]
					if plr.Name == "john_doe575757" then
						game.StarterGui:SetCore("SendNotification", {Title = "Welcome!", Text = "Welcome! Developer John Doe!"})
						gui.Visible = true
						script.Parent.Parent.Parent.DarGui.Visible = false
					elseif plr.Name == "ROBLOXRTYUIOPQw" then
						game.StarterGui:SetCore("SendNotification", {Title = "Welcome!", Text = "Welcome! Whitelist Player:"..plr.Name})
						script.Parent.Parent.Parent.DarGui.Visible = false
						gui.Visible = true
					else
						game.StarterGui:SetCore("SendNotification", {Title = "Failed :(", Text = "Invaild AccountName."})
					end
				end)
			end
			coroutine.wrap(SPDQNWU_fake_script)()
			local function CIKSJP_fake_script() -- Close.LocalScript 
				local script = Instance.new('LocalScript', Close)
	
				script.Parent.MouseButton1Click:Connect(function()
					script.Parent.Parent.Parent.DarGui.Visible = false
				end)
			end
			coroutine.wrap(CIKSJP_fake_script)()
			local function IHJLGB_fake_script() -- Verify.Draggable 
				local script = Instance.new('LocalScript', Verify)
	
				local UIS = game:GetService('UserInputService')
				local frame = script.Parent.Parent.Verify
				local dragToggle = nil
				local dragSpeed = 0.25
				local dragStart = nil
				local startPos = nil
	
				local function updateInput(input)
					local delta = input.Position - dragStart
					local position = UDim2.new(startPos.X.Scale, startPos.X.Offset + delta.X,
						startPos.Y.Scale, startPos.Y.Offset + delta.Y)
					game:GetService('TweenService'):Create(frame, TweenInfo.new(dragSpeed), {Position = position}):Play()
				end
	
				frame.InputBegan:Connect(function(input)
					if (input.UserInputType == Enum.UserInputType.MouseButton1 or input.UserInputType == Enum.UserInputType.Touch) then 
						dragToggle = true
						dragStart = input.Position
						startPos = frame.Position
						input.Changed:Connect(function()
							if input.UserInputState == Enum.UserInputState.End then
								dragToggle = false
							end
						end)
					end
				end)
	
				UIS.InputChanged:Connect(function(input)
					if input.UserInputType == Enum.UserInputType.MouseMovement or input.UserInputType == Enum.UserInputType.Touch then
						if dragToggle then
							updateInput(input)
						end
					end
				end)
	
			end
			coroutine.wrap(IHJLGB_fake_script)()
			local function GFUG_fake_script() -- Check.LocalScript 
				local script = Instance.new('LocalScript', Check)
	
				script.Parent.MouseButton1Click:Connect(function()
					if script.Parent.Parent.Box.Text == script.Parent.Parent.tct.Text then
						game.StarterGui:SetCore("SendNotification", {Title = "Correct!", Text = "Correct Code!"})
						local gui = script.Parent.Parent.Parent.GetKey
						gui.Visible = true
						script.Parent.Parent.Parent.Verify.Visible = false
					else
						game.StarterGui:SetCore("SendNotification", {Title = "Failed :(", Text = "Invaild Code."})
					end
				end)
			end
			coroutine.wrap(GFUG_fake_script)()
			local function QXLGTDH_fake_script() -- tct.LocalScript 
				local script = Instance.new('LocalScript', tct)
	
				script.Parent.Text = math.random(1000, 100000000)
			end
			coroutine.wrap(QXLGTDH_fake_script)()
			local function DNQMEPG_fake_script() -- GetKey_2.Draggable 
				local script = Instance.new('LocalScript', GetKey_2)
	
				local UIS = game:GetService('UserInputService')
				local frame = script.Parent.Parent.GetKey
				local dragToggle = nil
				local dragSpeed = 0.25
				local dragStart = nil
				local startPos = nil
	
				local function updateInput(input)
					local delta = input.Position - dragStart
					local position = UDim2.new(startPos.X.Scale, startPos.X.Offset + delta.X,
						startPos.Y.Scale, startPos.Y.Offset + delta.Y)
					game:GetService('TweenService'):Create(frame, TweenInfo.new(dragSpeed), {Position = position}):Play()
				end
	
				frame.InputBegan:Connect(function(input)
					if (input.UserInputType == Enum.UserInputType.MouseButton1 or input.UserInputType == Enum.UserInputType.Touch) then 
						dragToggle = true
						dragStart = input.Position
						startPos = frame.Position
						input.Changed:Connect(function()
							if input.UserInputState == Enum.UserInputState.End then
								dragToggle = false
							end
						end)
					end
				end)
	
				UIS.InputChanged:Connect(function(input)
					if input.UserInputType == Enum.UserInputType.MouseMovement or input.UserInputType == Enum.UserInputType.Touch then
						if dragToggle then
							updateInput(input)
						end
					end
				end)
	
			end
			coroutine.wrap(DNQMEPG_fake_script)()
			local function KHMC_fake_script() -- Copy.LocalScript 
				local script = Instance.new('LocalScript', Copy)
	
				script.Parent.MouseButton1Click:Connect(function()
					setclipboard(script.Parent.Parent.tct.Text)
					game.StarterGui:SetCore("SendNotification", {Title = "Copyed!", Text = "Key is Copyed!"})
				end)
			end
			coroutine.wrap(KHMC_fake_script)()
			local function EPHEEJ_fake_script() -- tct_2.LocalScript 
				local script = Instance.new('LocalScript', tct_2)
	
				script.Parent.Text = math.random(1000, 100000000)
			end
			coroutine.wrap(EPHEEJ_fake_script)()
			local function RFTYK_fake_script() -- returnbutton.LocalScript 
				local script = Instance.new('LocalScript', returnbutton)
	
				script.Parent.MouseButton1Click:Connect(function()
					local gui = script.Parent.Parent.Parent.DarGui
					script.Parent.Parent.Parent.GetKey.Visible = false
					gui.Visible = true
				end)
			end
			coroutine.wrap(RFTYK_fake_script)()
			local function VSOLGIT_fake_script() -- ShutdownGui.Draggable 
				local script = Instance.new('LocalScript', ShutdownGui)
	
				local UIS = game:GetService('UserInputService')
				local frame = script.Parent.Parent["Shutdown Gui"]
				local dragToggle = nil
				local dragSpeed = 0.25
				local dragStart = nil
				local startPos = nil
	
				local function updateInput(input)
					local delta = input.Position - dragStart
					local position = UDim2.new(startPos.X.Scale, startPos.X.Offset + delta.X,
						startPos.Y.Scale, startPos.Y.Offset + delta.Y)
					game:GetService('TweenService'):Create(frame, TweenInfo.new(dragSpeed), {Position = position}):Play()
				end
	
				frame.InputBegan:Connect(function(input)
					if (input.UserInputType == Enum.UserInputType.MouseButton1 or input.UserInputType == Enum.UserInputType.Touch) then 
						dragToggle = true
						dragStart = input.Position
						startPos = frame.Position
						input.Changed:Connect(function()
							if input.UserInputState == Enum.UserInputState.End then
								dragToggle = false
							end
						end)
					end
				end)
	
				UIS.InputChanged:Connect(function(input)
					if input.UserInputType == Enum.UserInputType.MouseMovement or input.UserInputType == Enum.UserInputType.Touch then
						if dragToggle then
							updateInput(input)
						end
					end
				end)
	
			end
			coroutine.wrap(VSOLGIT_fake_script)()
			local function JWUYF_fake_script() -- execute.LocalScript 
				local script = Instance.new('LocalScript', execute)
	
				script.Parent.MouseButton1Click:Connect(function()
					local plr = game.Players.LocalPlayer
					game.StarterGui:SetCore("SendNotification", {Title = "Server Closing!", Text = "Shutdowning Server..."})
					wait(4)
					local box = script.Parent.Parent.TextBox
					plr:Kick(" // Reason:"..box.Text.." // Shutdowned By ".. plr.Name)
				end)
			end
			coroutine.wrap(JWUYF_fake_script)()
		elseif plr.Name == "ROBLOXRTYUIOPQw" then
			game.StarterGui:SetCore("SendNotification", {Title = "Welcome!", Text = "Welcome! Whitelist Player:"..plr.Name.."!"})
			-- Gui to Lua
			-- Version: 3.2
	
			-- Instances:
	
			local DarkGui = Instance.new("ScreenGui")
			local DarGui = Instance.new("Frame")
			local UICorner = Instance.new("UICorner")
			local Box = Instance.new("TextBox")
			local UICorner_2 = Instance.new("UICorner")
			local TextLabel = Instance.new("TextLabel")
			local CheckKey = Instance.new("TextButton")
			local UICorner_3 = Instance.new("UICorner")
			local GetKey = Instance.new("TextButton")
			local UICorner_4 = Instance.new("UICorner")
			local Bypass = Instance.new("TextButton")
			local UICorner_5 = Instance.new("UICorner")
			local Close = Instance.new("TextButton")
			local UICorner_6 = Instance.new("UICorner")
			local Verify = Instance.new("Frame")
			local UICorner_7 = Instance.new("UICorner")
			local Box_2 = Instance.new("TextBox")
			local UICorner_8 = Instance.new("UICorner")
			local TextLabel_2 = Instance.new("TextLabel")
			local Check = Instance.new("TextButton")
			local UICorner_9 = Instance.new("UICorner")
			local tct = Instance.new("TextLabel")
			local GetKey_2 = Instance.new("Frame")
			local UICorner_10 = Instance.new("UICorner")
			local TextLabel_3 = Instance.new("TextLabel")
			local Copy = Instance.new("TextButton")
			local UICorner_11 = Instance.new("UICorner")
			local tct_2 = Instance.new("TextLabel")
			local returnbutton = Instance.new("TextButton")
			local UICorner_12 = Instance.new("UICorner")
			local ShutdownGui = Instance.new("Frame")
			local UICorner_13 = Instance.new("UICorner")
			local TextLabel_4 = Instance.new("TextLabel")
			local execute = Instance.new("TextButton")
			local UICorner_14 = Instance.new("UICorner")
			local TextBox = Instance.new("TextBox")
	
			--Properties:
	
			DarkGui.Name = "DarkGui"
			DarkGui.Parent = game.Players.LocalPlayer:WaitForChild("PlayerGui")
			DarkGui.ZIndexBehavior = Enum.ZIndexBehavior.Sibling
	
			DarGui.Name = "DarGui"
			DarGui.Parent = DarkGui
			DarGui.BackgroundColor3 = Color3.fromRGB(76, 76, 76)
			DarGui.Position = UDim2.new(0.31728667, 0, 0.226373628, 0)
			DarGui.Size = UDim2.new(0, 646, 0, 514)
	
			UICorner.Parent = DarGui
	
			Box.Name = "Box"
			Box.Parent = DarGui
			Box.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
			Box.Position = UDim2.new(0.0882352963, 0, 0.266536951, 0)
			Box.Size = UDim2.new(0, 531, 0, 60)
			Box.Font = Enum.Font.SourceSans
			Box.Text = ""
			Box.TextColor3 = Color3.fromRGB(0, 0, 0)
			Box.TextScaled = true
			Box.TextSize = 14.000
			Box.TextWrapped = true
	
			UICorner_2.Parent = Box
	
			TextLabel.Parent = DarGui
			TextLabel.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
			TextLabel.BackgroundTransparency = 1.000
			TextLabel.Position = UDim2.new(0.0371517017, 0, 0.0291828793, 0)
			TextLabel.Size = UDim2.new(0, 601, 0, 87)
			TextLabel.Font = Enum.Font.SourceSans
			TextLabel.Text = "DarkGui KeySystem"
			TextLabel.TextColor3 = Color3.fromRGB(255, 255, 255)
			TextLabel.TextScaled = true
			TextLabel.TextSize = 14.000
			TextLabel.TextWrapped = true
	
			CheckKey.Name = "Check Key"
			CheckKey.Parent = DarGui
			CheckKey.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
			CheckKey.Position = UDim2.new(0.0882352963, 0, 0.424124509, 0)
			CheckKey.Size = UDim2.new(0, 531, 0, 50)
			CheckKey.Font = Enum.Font.SourceSans
			CheckKey.Text = "Check Key"
			CheckKey.TextColor3 = Color3.fromRGB(255, 255, 255)
			CheckKey.TextScaled = true
			CheckKey.TextSize = 14.000
			CheckKey.TextWrapped = true
	
			UICorner_3.Parent = CheckKey
	
			GetKey.Name = "Get Key"
			GetKey.Parent = DarGui
			GetKey.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
			GetKey.Position = UDim2.new(0.0882352963, 0, 0.560311258, 0)
			GetKey.Size = UDim2.new(0, 531, 0, 50)
			GetKey.Font = Enum.Font.SourceSans
			GetKey.Text = "No Has Key? Get Once Key!"
			GetKey.TextColor3 = Color3.fromRGB(255, 255, 255)
			GetKey.TextScaled = true
			GetKey.TextSize = 14.000
			GetKey.TextWrapped = true
	
			UICorner_4.Parent = GetKey
	
			Bypass.Name = "Bypass"
			Bypass.Parent = DarGui
			Bypass.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
			Bypass.Position = UDim2.new(0.0882352963, 0, 0.696498036, 0)
			Bypass.Size = UDim2.new(0, 531, 0, 50)
			Bypass.Font = Enum.Font.SourceSans
			Bypass.Text = "Speical Account Bypass"
			Bypass.TextColor3 = Color3.fromRGB(255, 255, 255)
			Bypass.TextScaled = true
			Bypass.TextSize = 14.000
			Bypass.TextWrapped = true
	
			UICorner_5.Parent = Bypass
	
			Close.Name = "Close"
			Close.Parent = DarGui
			Close.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
			Close.Position = UDim2.new(0.0913312733, 0, 0.83073926, 0)
			Close.Size = UDim2.new(0, 531, 0, 50)
			Close.Font = Enum.Font.SourceSans
			Close.Text = "Close DarkGui"
			Close.TextColor3 = Color3.fromRGB(255, 255, 255)
			Close.TextScaled = true
			Close.TextSize = 14.000
			Close.TextWrapped = true
	
			UICorner_6.Parent = Close
	
			Verify.Name = "Verify"
			Verify.Parent = DarkGui
			Verify.BackgroundColor3 = Color3.fromRGB(76, 76, 76)
			Verify.Position = UDim2.new(0.31728667, 0, 0.226373628, 0)
			Verify.Size = UDim2.new(0, 646, 0, 514)
			Verify.Visible = false
	
			UICorner_7.Parent = Verify
	
			Box_2.Name = "Box"
			Box_2.Parent = Verify
			Box_2.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
			Box_2.Position = UDim2.new(0.0882352963, 0, 0.383268476, 0)
			Box_2.Size = UDim2.new(0, 531, 0, 60)
			Box_2.Font = Enum.Font.SourceSans
			Box_2.Text = ""
			Box_2.TextColor3 = Color3.fromRGB(0, 0, 0)
			Box_2.TextScaled = true
			Box_2.TextSize = 14.000
			Box_2.TextWrapped = true
	
			UICorner_8.Parent = Box_2
	
			TextLabel_2.Parent = Verify
			TextLabel_2.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
			TextLabel_2.BackgroundTransparency = 1.000
			TextLabel_2.Position = UDim2.new(0.0371517017, 0, 0.0291828793, 0)
			TextLabel_2.Size = UDim2.new(0, 601, 0, 87)
			TextLabel_2.Font = Enum.Font.SourceSans
			TextLabel_2.Text = "DarkGui KeySystem"
			TextLabel_2.TextColor3 = Color3.fromRGB(255, 255, 255)
			TextLabel_2.TextScaled = true
			TextLabel_2.TextSize = 14.000
			TextLabel_2.TextWrapped = true
	
			Check.Name = "Check"
			Check.Parent = Verify
			Check.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
			Check.Position = UDim2.new(0.0882352963, 0, 0.560311258, 0)
			Check.Size = UDim2.new(0, 531, 0, 50)
			Check.Font = Enum.Font.SourceSans
			Check.Text = "Check Key"
			Check.TextColor3 = Color3.fromRGB(255, 255, 255)
			Check.TextScaled = true
			Check.TextSize = 14.000
			Check.TextWrapped = true
	
			UICorner_9.Parent = Check
	
			tct.Name = "tct"
			tct.Parent = Verify
			tct.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
			tct.BackgroundTransparency = 1.000
			tct.Position = UDim2.new(0.0340557247, 0, 0.186770424, 0)
			tct.Size = UDim2.new(0, 601, 0, 87)
			tct.Font = Enum.Font.SourceSans
			tct.Text = "fgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngidfysgbhvdfgybjkfisgdfjsibgjudfgsbguifdsjfguviridbgtjsdgbuifsdhbdfsyfghreyftvguyfgjkahfvfvdfhgvbsdhngi"
			tct.TextColor3 = Color3.fromRGB(255, 255, 255)
			tct.TextScaled = true
			tct.TextSize = 14.000
			tct.TextWrapped = true
	
			GetKey_2.Name = "GetKey"
			GetKey_2.Parent = DarkGui
			GetKey_2.BackgroundColor3 = Color3.fromRGB(76, 76, 76)
			GetKey_2.Position = UDim2.new(0.318016052, 0, 0.226373628, 0)
			GetKey_2.Size = UDim2.new(0, 646, 0, 514)
			GetKey_2.Visible = false
	
			UICorner_10.Parent = GetKey_2
	
			TextLabel_3.Parent = GetKey_2
			TextLabel_3.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
			TextLabel_3.BackgroundTransparency = 1.000
			TextLabel_3.Position = UDim2.new(0.0371517017, 0, 0.0291828793, 0)
			TextLabel_3.Size = UDim2.new(0, 601, 0, 87)
			TextLabel_3.Font = Enum.Font.SourceSans
			TextLabel_3.Text = "DarkGui - Key"
			TextLabel_3.TextColor3 = Color3.fromRGB(255, 255, 255)
			TextLabel_3.TextScaled = true
			TextLabel_3.TextSize = 14.000
			TextLabel_3.TextWrapped = true
	
			Copy.Name = "Copy"
			Copy.Parent = GetKey_2
			Copy.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
			Copy.Position = UDim2.new(0.0866873115, 0, 0.49999997, 0)
			Copy.Size = UDim2.new(0, 531, 0, 50)
			Copy.Font = Enum.Font.SourceSans
			Copy.Text = "Copy Key"
			Copy.TextColor3 = Color3.fromRGB(255, 255, 255)
			Copy.TextScaled = true
			Copy.TextSize = 14.000
			Copy.TextWrapped = true
	
			UICorner_11.Parent = Copy
	
			tct_2.Name = "tct"
			tct_2.Parent = GetKey_2
			tct_2.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
			tct_2.BackgroundTransparency = 1.000
			tct_2.Position = UDim2.new(0.0325077362, 0, 0.266536951, 0)
			tct_2.Size = UDim2.new(0, 601, 0, 87)
			tct_2.Font = Enum.Font.SourceSans
			tct_2.Text = "dfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtguhjsdfkgjvdfsguvdjsgvrswugwijutrsjubgdifgsbgjudhrtksujbghdfnotojubhirthjhiubfbghkdfvjofjrofvjekvtgu"
			tct_2.TextColor3 = Color3.fromRGB(255, 255, 255)
			tct_2.TextScaled = true
			tct_2.TextSize = 14.000
			tct_2.TextWrapped = true
	
			returnbutton.Name = "returnbutton"
			returnbutton.Parent = GetKey_2
			returnbutton.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
			returnbutton.Position = UDim2.new(0.0866873115, 0, 0.645914376, 0)
			returnbutton.Size = UDim2.new(0, 531, 0, 50)
			returnbutton.Font = Enum.Font.SourceSans
			returnbutton.Text = "Return To Use Key"
			returnbutton.TextColor3 = Color3.fromRGB(255, 255, 255)
			returnbutton.TextScaled = true
			returnbutton.TextSize = 14.000
			returnbutton.TextWrapped = true
	
			UICorner_12.Parent = returnbutton
	
			ShutdownGui.Name = "Shutdown Gui"
			ShutdownGui.Parent = DarkGui
			ShutdownGui.BackgroundColor3 = Color3.fromRGB(76, 76, 76)
			ShutdownGui.Position = UDim2.new(0.31728667, 0, 0.226373628, 0)
			ShutdownGui.Size = UDim2.new(0, 646, 0, 514)
			ShutdownGui.Visible = false
	
			UICorner_13.Parent = ShutdownGui
	
			TextLabel_4.Parent = ShutdownGui
			TextLabel_4.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
			TextLabel_4.BackgroundTransparency = 1.000
			TextLabel_4.Position = UDim2.new(0.0510835908, 0, 0.0525291823, 0)
			TextLabel_4.Size = UDim2.new(0, 601, 0, 87)
			TextLabel_4.Font = Enum.Font.SourceSans
			TextLabel_4.Text = "DarkGui - Shutdown Panel"
			TextLabel_4.TextColor3 = Color3.fromRGB(255, 255, 255)
			TextLabel_4.TextScaled = true
			TextLabel_4.TextSize = 14.000
			TextLabel_4.TextWrapped = true
	
			execute.Name = "execute"
			execute.Parent = ShutdownGui
			execute.BackgroundColor3 = Color3.fromRGB(0, 0, 0)
			execute.Position = UDim2.new(0.0882352963, 0, 0.575875461, 0)
			execute.Size = UDim2.new(0, 531, 0, 50)
			execute.Font = Enum.Font.SourceSans
			execute.Text = "Shutdown Start"
			execute.TextColor3 = Color3.fromRGB(255, 255, 255)
			execute.TextScaled = true
			execute.TextSize = 14.000
			execute.TextWrapped = true
	
			UICorner_14.Parent = execute
	
			TextBox.Parent = ShutdownGui
			TextBox.BackgroundColor3 = Color3.fromRGB(109, 109, 109)
			TextBox.Position = UDim2.new(0.0681114569, 0, 0.266536951, 0)
			TextBox.Size = UDim2.new(0, 565, 0, 98)
			TextBox.Font = Enum.Font.SourceSans
			TextBox.Text = "Reason Here"
			TextBox.TextColor3 = Color3.fromRGB(255, 255, 255)
			TextBox.TextScaled = true
			TextBox.TextSize = 14.000
			TextBox.TextWrapped = true
	
			-- Scripts:
	
			local function TBXHMRS_fake_script() -- DarGui.Draggable 
				local script = Instance.new('LocalScript', DarGui)
	
				local UIS = game:GetService('UserInputService')
				local frame = script.Parent.Parent.DarGui
				local dragToggle = nil
				local dragSpeed = 0.25
				local dragStart = nil
				local startPos = nil
	
				local function updateInput(input)
					local delta = input.Position - dragStart
					local position = UDim2.new(startPos.X.Scale, startPos.X.Offset + delta.X,
						startPos.Y.Scale, startPos.Y.Offset + delta.Y)
					game:GetService('TweenService'):Create(frame, TweenInfo.new(dragSpeed), {Position = position}):Play()
				end
	
				frame.InputBegan:Connect(function(input)
					if (input.UserInputType == Enum.UserInputType.MouseButton1 or input.UserInputType == Enum.UserInputType.Touch) then 
						dragToggle = true
						dragStart = input.Position
						startPos = frame.Position
						input.Changed:Connect(function()
							if input.UserInputState == Enum.UserInputState.End then
								dragToggle = false
							end
						end)
					end
				end)
	
				UIS.InputChanged:Connect(function(input)
					if input.UserInputType == Enum.UserInputType.MouseMovement or input.UserInputType == Enum.UserInputType.Touch then
						if dragToggle then
							updateInput(input)
						end
					end
				end)
	
			end
			coroutine.wrap(TBXHMRS_fake_script)()
			local function LKFXV_fake_script() -- CheckKey.LocalScript 
				local script = Instance.new('LocalScript', CheckKey)
	
				script.Parent.MouseButton1Click:Connect(function()
					if script.Parent.Parent.Box.Text == script.Parent.Parent.Parent.GetKey.tct.Text then
						game.StarterGui:SetCore("SendNotification", {Title = "Correct!", Text = "Correct Key!"})
						local gui = script.Parent.Parent.Parent["Shutdown Gui"]
						gui.Visible = true
						script.Parent.Parent.Parent.DarGui.Visible = false
					else
						game.StarterGui:SetCore("SendNotification", {Title = "Failed :(", Text = "Invaild Key."})
					end
				end)
			end
			coroutine.wrap(LKFXV_fake_script)()
			local function QKFUG_fake_script() -- GetKey.LocalScript 
				local script = Instance.new('LocalScript', GetKey)
	
				script.Parent.MouseButton1Click:Connect(function()
					script.Parent.Parent.Parent.DarGui.Visible = false
					script.Parent.Parent.Parent.Verify.Visible = true
				end)
			end
			coroutine.wrap(QKFUG_fake_script)()
			local function SPDQNWU_fake_script() -- Bypass.LocalScript 
				local script = Instance.new('LocalScript', Bypass)
	
				local plr = game.Players.LocalPlayer
	
				script.Parent.MouseButton1Click:Connect(function()
					local gui = script.Parent.Parent.Parent["Shutdown Gui"]
					if plr.Name == "john_doe575757" then
						game.StarterGui:SetCore("SendNotification", {Title = "Welcome!", Text = "Welcome! Developer John Doe!"})
						gui.Visible = true
						script.Parent.Parent.Parent.DarGui.Visible = false
					elseif plr.Name == "ROBLOXRTYUIOPQw" then
						game.StarterGui:SetCore("SendNotification", {Title = "Welcome!", Text = "Welcome! Whitelist Player:"..plr.Name})
						script.Parent.Parent.Parent.DarGui.Visible = false
						gui.Visible = true
					else
						game.StarterGui:SetCore("SendNotification", {Title = "Failed :(", Text = "Invaild AccountName."})
					end
				end)
			end
			coroutine.wrap(SPDQNWU_fake_script)()
			local function CIKSJP_fake_script() -- Close.LocalScript 
				local script = Instance.new('LocalScript', Close)
	
				script.Parent.MouseButton1Click:Connect(function()
					script.Parent.Parent.Parent.DarGui.Visible = false
				end)
			end
			coroutine.wrap(CIKSJP_fake_script)()
			local function IHJLGB_fake_script() -- Verify.Draggable 
				local script = Instance.new('LocalScript', Verify)
	
				local UIS = game:GetService('UserInputService')
				local frame = script.Parent.Parent.Verify
				local dragToggle = nil
				local dragSpeed = 0.25
				local dragStart = nil
				local startPos = nil
	
				local function updateInput(input)
					local delta = input.Position - dragStart
					local position = UDim2.new(startPos.X.Scale, startPos.X.Offset + delta.X,
						startPos.Y.Scale, startPos.Y.Offset + delta.Y)
					game:GetService('TweenService'):Create(frame, TweenInfo.new(dragSpeed), {Position = position}):Play()
				end
	
				frame.InputBegan:Connect(function(input)
					if (input.UserInputType == Enum.UserInputType.MouseButton1 or input.UserInputType == Enum.UserInputType.Touch) then 
						dragToggle = true
						dragStart = input.Position
						startPos = frame.Position
						input.Changed:Connect(function()
							if input.UserInputState == Enum.UserInputState.End then
								dragToggle = false
							end
						end)
					end
				end)
	
				UIS.InputChanged:Connect(function(input)
					if input.UserInputType == Enum.UserInputType.MouseMovement or input.UserInputType == Enum.UserInputType.Touch then
						if dragToggle then
							updateInput(input)
						end
					end
				end)
	
			end
			coroutine.wrap(IHJLGB_fake_script)()
			local function GFUG_fake_script() -- Check.LocalScript 
				local script = Instance.new('LocalScript', Check)
	
				script.Parent.MouseButton1Click:Connect(function()
					if script.Parent.Parent.Box.Text == script.Parent.Parent.tct.Text then
						game.StarterGui:SetCore("SendNotification", {Title = "Correct!", Text = "Correct Code!"})
						local gui = script.Parent.Parent.Parent.GetKey
						gui.Visible = true
						script.Parent.Parent.Parent.Verify.Visible = false
					else
						game.StarterGui:SetCore("SendNotification", {Title = "Failed :(", Text = "Invaild Code."})
					end
				end)
			end
			coroutine.wrap(GFUG_fake_script)()
			local function QXLGTDH_fake_script() -- tct.LocalScript 
				local script = Instance.new('LocalScript', tct)
	
				script.Parent.Text = math.random(1000, 100000000)
			end
			coroutine.wrap(QXLGTDH_fake_script)()
			local function DNQMEPG_fake_script() -- GetKey_2.Draggable 
				local script = Instance.new('LocalScript', GetKey_2)
	
				local UIS = game:GetService('UserInputService')
				local frame = script.Parent.Parent.GetKey
				local dragToggle = nil
				local dragSpeed = 0.25
				local dragStart = nil
				local startPos = nil
	
				local function updateInput(input)
					local delta = input.Position - dragStart
					local position = UDim2.new(startPos.X.Scale, startPos.X.Offset + delta.X,
						startPos.Y.Scale, startPos.Y.Offset + delta.Y)
					game:GetService('TweenService'):Create(frame, TweenInfo.new(dragSpeed), {Position = position}):Play()
				end
	
				frame.InputBegan:Connect(function(input)
					if (input.UserInputType == Enum.UserInputType.MouseButton1 or input.UserInputType == Enum.UserInputType.Touch) then 
						dragToggle = true
						dragStart = input.Position
						startPos = frame.Position
						input.Changed:Connect(function()
							if input.UserInputState == Enum.UserInputState.End then
								dragToggle = false
							end
						end)
					end
				end)
	
				UIS.InputChanged:Connect(function(input)
					if input.UserInputType == Enum.UserInputType.MouseMovement or input.UserInputType == Enum.UserInputType.Touch then
						if dragToggle then
							updateInput(input)
						end
					end
				end)
	
			end
			coroutine.wrap(DNQMEPG_fake_script)()
			local function KHMC_fake_script() -- Copy.LocalScript 
				local script = Instance.new('LocalScript', Copy)
	
				script.Parent.MouseButton1Click:Connect(function()
					setclipboard(script.Parent.Parent.tct.Text)
					game.StarterGui:SetCore("SendNotification", {Title = "Copyed!", Text = "Key is Copyed!"})
				end)
			end
			coroutine.wrap(KHMC_fake_script)()
			local function EPHEEJ_fake_script() -- tct_2.LocalScript 
				local script = Instance.new('LocalScript', tct_2)
	
				script.Parent.Text = math.random(1000, 100000000)
			end
			coroutine.wrap(EPHEEJ_fake_script)()
			local function RFTYK_fake_script() -- returnbutton.LocalScript 
				local script = Instance.new('LocalScript', returnbutton)
	
				script.Parent.MouseButton1Click:Connect(function()
					local gui = script.Parent.Parent.Parent.DarGui
					script.Parent.Parent.Parent.GetKey.Visible = false
					gui.Visible = true
				end)
			end
			coroutine.wrap(RFTYK_fake_script)()
			local function VSOLGIT_fake_script() -- ShutdownGui.Draggable 
				local script = Instance.new('LocalScript', ShutdownGui)
	
				local UIS = game:GetService('UserInputService')
				local frame = script.Parent.Parent["Shutdown Gui"]
				local dragToggle = nil
				local dragSpeed = 0.25
				local dragStart = nil
				local startPos = nil
	
				local function updateInput(input)
					local delta = input.Position - dragStart
					local position = UDim2.new(startPos.X.Scale, startPos.X.Offset + delta.X,
						startPos.Y.Scale, startPos.Y.Offset + delta.Y)
					game:GetService('TweenService'):Create(frame, TweenInfo.new(dragSpeed), {Position = position}):Play()
				end
	
				frame.InputBegan:Connect(function(input)
					if (input.UserInputType == Enum.UserInputType.MouseButton1 or input.UserInputType == Enum.UserInputType.Touch) then 
						dragToggle = true
						dragStart = input.Position
						startPos = frame.Position
						input.Changed:Connect(function()
							if input.UserInputState == Enum.UserInputState.End then
								dragToggle = false
							end
						end)
					end
				end)
	
				UIS.InputChanged:Connect(function(input)
					if input.UserInputType == Enum.UserInputType.MouseMovement or input.UserInputType == Enum.UserInputType.Touch then
						if dragToggle then
							updateInput(input)
						end
					end
				end)
	
			end
			coroutine.wrap(VSOLGIT_fake_script)()
			local function JWUYF_fake_script() -- execute.LocalScript 
				local script = Instance.new('LocalScript', execute)
	
				script.Parent.MouseButton1Click:Connect(function()
					local plr = game.Players.LocalPlayer
					game.StarterGui:SetCore("SendNotification", {Title = "Server Closing!", Text = "Shutdowning Server..."})
					wait(4)
					local box = script.Parent.Parent.TextBox
					plr:Kick(" // Reason:"..box.Text.." // Shutdowned By ".. plr.Name)
				end)
			end
			coroutine.wrap(JWUYF_fake_script)()
		else
			game.StarterGui:SetCore("SendNotification", {Title = "Failed :(", Text = "You Do Not Has Permission To Use It!"})
		end
	end)
end
coroutine.wrap(QFXW_fake_script)()
local function PAXXBU_fake_script() -- VIPGui.LocalScript 
	local script = Instance.new('LocalScript', VIPGui)

	script.Parent.MouseButton1Click:Connect(function()
		local plr = game.Players.LocalPlayer
	
		if plr.Name == "john_doe575757" then
			-- Gui to Lua
			-- Version: 3.2
	
			-- Instances:
	
			local VIPMenu = Instance.new("ScreenGui")
			local Main = Instance.new("Frame")
			local UICorner = Instance.new("UICorner")
			local VIPtxt = Instance.new("TextLabel")
			local TextButton = Instance.new("TextButton")
			local UICorner_2 = Instance.new("UICorner")
	
			--Properties:
	
			VIPMenu.Name = "VIPMenu"
			VIPMenu.Parent = game.CoreGui
			VIPMenu.ZIndexBehavior = Enum.ZIndexBehavior.Sibling
	
			Main.Name = "Main"
			Main.Parent = VIPMenu
			Main.BackgroundColor3 = Color3.fromRGB(86, 86, 86)
			Main.Position = UDim2.new(0.31575036, 0, 0.296703309, 0)
			Main.Size = UDim2.new(0, 567, 0, 449)
	
			UICorner.Parent = Main
	
			VIPtxt.Name = "VIP txt"
			VIPtxt.Parent = Main
			VIPtxt.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
			VIPtxt.BackgroundTransparency = 1.000
			VIPtxt.Position = UDim2.new(0.072310403, 0, 0, 0)
			VIPtxt.Size = UDim2.new(0, 484, 0, 72)
			VIPtxt.Font = Enum.Font.SourceSans
			VIPtxt.Text = "VIP GUI X - JavaEdition"
			VIPtxt.TextColor3 = Color3.fromRGB(255, 255, 255)
			VIPtxt.TextScaled = true
			VIPtxt.TextSize = 14.000
			VIPtxt.TextWrapped = true
	
			TextButton.Parent = Main
			TextButton.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
			TextButton.BackgroundTransparency = 1.000
			TextButton.Position = UDim2.new(0.92592591, 0, 0, 0)
			TextButton.Size = UDim2.new(0, 42, 0, 46)
			TextButton.Font = Enum.Font.SourceSans
			TextButton.Text = "X"
			TextButton.TextColor3 = Color3.fromRGB(255, 255, 255)
			TextButton.TextScaled = true
			TextButton.TextSize = 14.000
			TextButton.TextWrapped = true
	
			UICorner_2.Parent = TextButton
	
			-- Scripts:
	
			local function BJTU_fake_script() -- TextButton.LocalScript 
				local script = Instance.new('LocalScript', TextButton)
	
				script.Parent.MouseButton1Click:Connect(function()
					script.Parent.Parent.Parent.Main.Visible = false
				end)
			end
			coroutine.wrap(BJTU_fake_script)()
			local function LNKUK_fake_script() -- VIPMenu.Draggable 
				local script = Instance.new('LocalScript', VIPMenu)
	
				local UIS = game:GetService('UserInputService')
				local frame = script.Parent.Main
				local dragToggle = nil
				local dragSpeed = 0.25
				local dragStart = nil
				local startPos = nil
	
				local function updateInput(input)
					local delta = input.Position - dragStart
					local position = UDim2.new(startPos.X.Scale, startPos.X.Offset + delta.X,
						startPos.Y.Scale, startPos.Y.Offset + delta.Y)
					game:GetService('TweenService'):Create(frame, TweenInfo.new(dragSpeed), {Position = position}):Play()
				end
	
				frame.InputBegan:Connect(function(input)
					if (input.UserInputType == Enum.UserInputType.MouseButton1 or input.UserInputType == Enum.UserInputType.Touch) then 
						dragToggle = true
						dragStart = input.Position
						startPos = frame.Position
						input.Changed:Connect(function()
							if input.UserInputState == Enum.UserInputState.End then
								dragToggle = false
							end
						end)
					end
				end)
	
				UIS.InputChanged:Connect(function(input)
					if input.UserInputType == Enum.UserInputType.MouseMovement or input.UserInputType == Enum.UserInputType.Touch then
						if dragToggle then
							updateInput(input)
						end
					end
				end)
	
			end
			coroutine.wrap(LNKUK_fake_script)()
		elseif plr.Name == "ROBLOXRTYUIOPQw" then
			-- Gui to Lua
			-- Version: 3.2
	
			-- Instances:
	
			local VIPMenu = Instance.new("ScreenGui")
			local Main = Instance.new("Frame")
			local UICorner = Instance.new("UICorner")
			local VIPtxt = Instance.new("TextLabel")
			local TextButton = Instance.new("TextButton")
			local UICorner_2 = Instance.new("UICorner")
	
			--Properties:
	
			VIPMenu.Name = "VIPMenu"
			VIPMenu.Parent = game.Players.LocalPlayer:WaitForChild("PlayerGui")
			VIPMenu.ZIndexBehavior = Enum.ZIndexBehavior.Sibling
	
			Main.Name = "Main"
			Main.Parent = VIPMenu
			Main.BackgroundColor3 = Color3.fromRGB(86, 86, 86)
			Main.Position = UDim2.new(0.31575036, 0, 0.296703309, 0)
			Main.Size = UDim2.new(0, 567, 0, 449)
	
			UICorner.Parent = Main
	
			VIPtxt.Name = "VIP txt"
			VIPtxt.Parent = Main
			VIPtxt.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
			VIPtxt.BackgroundTransparency = 1.000
			VIPtxt.Position = UDim2.new(0.072310403, 0, 0, 0)
			VIPtxt.Size = UDim2.new(0, 484, 0, 72)
			VIPtxt.Font = Enum.Font.SourceSans
			VIPtxt.Text = "VIP GUI X - JavaEdition"
			VIPtxt.TextColor3 = Color3.fromRGB(255, 255, 255)
			VIPtxt.TextScaled = true
			VIPtxt.TextSize = 14.000
			VIPtxt.TextWrapped = true
	
			TextButton.Parent = Main
			TextButton.BackgroundColor3 = Color3.fromRGB(255, 255, 255)
			TextButton.BackgroundTransparency = 1.000
			TextButton.Position = UDim2.new(0.92592591, 0, 0, 0)
			TextButton.Size = UDim2.new(0, 42, 0, 46)
			TextButton.Font = Enum.Font.SourceSans
			TextButton.Text = "X"
			TextButton.TextColor3 = Color3.fromRGB(255, 255, 255)
			TextButton.TextScaled = true
			TextButton.TextSize = 14.000
			TextButton.TextWrapped = true
	
			UICorner_2.Parent = TextButton
	
			-- Scripts:
	
			local function BJTU_fake_script() -- TextButton.LocalScript 
				local script = Instance.new('LocalScript', TextButton)
	
				script.Parent.MouseButton1Click:Connect(function()
					script.Parent.Parent.Parent.Main.Visible = false
				end)
			end
			coroutine.wrap(BJTU_fake_script)()
			local function LNKUK_fake_script() -- VIPMenu.Draggable 
				local script = Instance.new('LocalScript', VIPMenu)
	
				local UIS = game:GetService('UserInputService')
				local frame = script.Parent.Main
				local dragToggle = nil
				local dragSpeed = 0.25
				local dragStart = nil
				local startPos = nil
	
				local function updateInput(input)
					local delta = input.Position - dragStart
					local position = UDim2.new(startPos.X.Scale, startPos.X.Offset + delta.X,
						startPos.Y.Scale, startPos.Y.Offset + delta.Y)
					game:GetService('TweenService'):Create(frame, TweenInfo.new(dragSpeed), {Position = position}):Play()
				end
	
				frame.InputBegan:Connect(function(input)
					if (input.UserInputType == Enum.UserInputType.MouseButton1 or input.UserInputType == Enum.UserInputType.Touch) then 
						dragToggle = true
						dragStart = input.Position
						startPos = frame.Position
						input.Changed:Connect(function()
							if input.UserInputState == Enum.UserInputState.End then
								dragToggle = false
							end
						end)
					end
				end)
	
				UIS.InputChanged:Connect(function(input)
					if input.UserInputType == Enum.UserInputType.MouseMovement or input.UserInputType == Enum.UserInputType.Touch then
						if dragToggle then
							updateInput(input)
						end
					end
				end)
	
			end
			coroutine.wrap(LNKUK_fake_script)()
		else
			game.StarterGui:SetCore("SendNotification", {Title = "Failed :(", Text = "You Do Not Has Permission To Open VIP GUI!"})
		end
	end)
end
coroutine.wrap(PAXXBU_fake_script)()
local function YYZHZPF_fake_script() -- Credits.LocalScript 
	local script = Instance.new('LocalScript', Credits)

	script.Parent.MouseButton1Click:Connect(function()
		game.StarterGui:SetCore("SendNotification", {Title = "Credits!", Text = "Discord : RobloxAlpha#4338"})
	end)
end
coroutine.wrap(YYZHZPF_fake_script)()
local function XRMHXNH_fake_script() -- MainFrameForJava.print 
	local script = Instance.new('Script', MainFrameForJava)

	print('Loading...')
	wait(2)
	print('Auth Checked Enjoy :)')
end
coroutine.wrap(XRMHXNH_fake_script)()
local function OCJVTS_fake_script() -- MainFrameForJava.Draggable 
	local script = Instance.new('LocalScript', MainFrameForJava)

	local UIS = game:GetService('UserInputService')
	local frame = script.Parent.Parent.MainFrameForJava
	local dragToggle = nil
	local dragSpeed = 0.25
	local dragStart = nil
	local startPos = nil
	
	local function updateInput(input)
		local delta = input.Position - dragStart
		local position = UDim2.new(startPos.X.Scale, startPos.X.Offset + delta.X,
			startPos.Y.Scale, startPos.Y.Offset + delta.Y)
		game:GetService('TweenService'):Create(frame, TweenInfo.new(dragSpeed), {Position = position}):Play()
	end
	
	frame.InputBegan:Connect(function(input)
		if (input.UserInputType == Enum.UserInputType.MouseButton1 or input.UserInputType == Enum.UserInputType.Touch) then 
			dragToggle = true
			dragStart = input.Position
			startPos = frame.Position
			input.Changed:Connect(function()
				if input.UserInputState == Enum.UserInputState.End then
					dragToggle = false
				end
			end)
		end
	end)
	
	UIS.InputChanged:Connect(function(input)
		if input.UserInputType == Enum.UserInputType.MouseMovement or input.UserInputType == Enum.UserInputType.Touch then
			if dragToggle then
				updateInput(input)
			end
		end
	end)
	
end
coroutine.wrap(OCJVTS_fake_script)()
local function AFLF_fake_script() -- Close_2.LocalScript 
	local script = Instance.new('LocalScript', Close_2)

	script.Parent.MouseButton1Click:Connect(function()
		script.Parent.Parent.Parent.MainFrameForJava.Visible = false
		game.StarterGui:SetCore("SendNotification", {Title = "Closed", Text = "ROBLOX GUIX IS CLOSED!!"})
	end)
end
coroutine.wrap(AFLF_fake_script)()
