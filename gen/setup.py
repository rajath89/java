from setuptools import setup, find_packages
 
 
setup(
  name='gen',
  version='0.1.1',
  description='cmd tool to generate java template file',  
  author='rajath',
  author_email='nagarajathsm@gmail.com',
  
  
        entry_points ={ 
            'console_scripts': [ 
                'gen = gen:main'
            ] 
        },  
  
  install_requires=['fire'] 
)
