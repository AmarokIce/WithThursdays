# By Someoneice.

'''
=== Pineapple license ===
I will provide all or part of the code, as long as you use it within the limits of the law, you can use these codes as you like.
You can get full access to this source code without paying any royalties, which will be permanent and irrevocable if you are granted this license.
If you have made a copy of the Program with these code, you should include this license to keep the original code open source.
Of course this license doesn't used in court, just like you know that none of us want legal battles for these meaningless things, so I hope you will respect this brief license.
I do not want my code to be used for commercial purposes, including but not limited to paid downloads.
If you think my mod is good to learn something, if you like, invite me to a cup of pineapple juice.
If you do not follow this simple agreement and legal liability arises, this has nothing to do with me, please take responsibility for yourself.
If you're selling my source code or compiled code, I'll be very angry and accuse you smelling ugly.

If you are unable to accept a license other than those approved by the Open Source Initiative, you may use these codes using the AFL-3.0 license, instead of complying with this license.
If you choose to accept AFL-3.0, you may need to show in your README or somewhere else that is very convenient to see, you are using the AFL-3.0 license.


=== 凤梨许可证 ===
我会提供全部或者部分的代码，只要您在法律限制之内使用，您可以随意的使用这些代码。
您可以获取这份源代码全部的使用权并且不需要支付任何版权税，如果您被授权了这份许可证，这将会永久生效且不可撤回。如果您使用这些代码制作了副本，您应当将本许可证包涵其中保持原有代码依然开源。
当然，这个许可证在法庭中站不住脚，您知道的，我们都不希望为了这些没有意义的事情而产生法律纠纷，所以我希望您能尊重这份非常简短的许可证。
我不希望我的代码被用于商业用途，包括但不限于付费下载。
如果您觉得您可以在我的代码中收获点什么，若您愿意，那就请我喝一杯凤梨汁吧。
如果您没有按照这份简单的协议执行，出现了法律责任，这与我无关，请您自己承担责任。
如果您正在贩卖我的源代码或者编译后代码，我会非常愤怒的指责你闻起来很臭。

如果您无法接受一份在开源社区协会认可之外的许可证，您可以参照AFL-3.0许可证来使用这些代码，而不是遵照这份许可证。
若您选择接受AFL-3.0，您可能需要在您的README中或者别的能够非常方便的看到的地方著明，您正在使用AFL-3.0许可证的情况下使用这些代码。
'''

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