import json
import os
import time

mod_path = os.path.dirname(os.path.abspath(__file__))

modid = input('請輸入modid。')

input_path = os.path.join(mod_path, "inputJson")
if os.path.exists(input_path):
  pass
else:
  os.mkdir(input_path)

while True:
  print('''
        [
          "layer0",
          "layer1",
          "layer2",
          ...
          "layerN"
        ]
        ''')
  jsonName = input('請將即將導入的內容按照上方演示格式填入，並將文件名命名與文件格式改為json並放入inputJson，然後按下回車繼續...')
  try:
    with open(input_path+"/json.json",'r', encoding='UTF-8') as f:
         Item = json.load(f)
  except:
    print("沒有檢查到json.json文件！請檢查路徑是否有無！")
    time.sleep(1)
  else:
    print(Item)
    getJson = input('請檢查即將輸入文件是否為上述格式，若沒有問題，請輸入yes或者y繼續。')
    if getJson == 'yes' or getJson == 'y':
        break

output_path = os.path.join(mod_path, "outputJson")
print('即將輸出Json到' + output_path)

if os.path.exists(output_path):
  pass
else:
  os.mkdir(output_path)

for NameHelper in Item:
  Icon = '''
  {
    "parent": "item/generated",
    "textures": {
      "layer0": "%s:item/%s"
    }
  }
  '''%(modid, NameHelper)

  with open(output_path+'/%s.json'%NameHelper, 'w') as json:
    json.write(Icon)
    
time.sleep(1)
    
print('已完成，即將清理inputJson文件夾。')
time.sleep(2)
os.remove(input_path+'/json.json')
os.rmdir(input_path)
print('完畢，正在退出程序...')
time.sleep(1)