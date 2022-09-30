import sys
import string
import secrets

pass_len = sys.argv

def pass_gen(size=12):
   chars = string.ascii_uppercase + string.ascii_lowercase + string.digits
   print(''.join(secrets.choice(chars) for x in range(size)))

for i in range(10):
    pass_gen(int(pass_len[1]))