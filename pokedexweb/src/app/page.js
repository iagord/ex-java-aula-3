import Image from 'next/image'


export default function Home() {
  return (
    <body class="bg-gray-200">
    <div class="flex h-screen">
        
    <div class="w-1/5 bg-blue-400 flex flex-col justify-center items-center">
      <img src="https://cdn.icon-icons.com/icons2/1898/PNG/512/pokemon_121114.png" alt="" className='mb-16  w-52'></img>
            <ul className=''>
                <li class="mb-4 bg-slate-500 p-4 pl-10 pr-10 rounded"><a href="#" class="text-white hover:text-blue-300">Home</a></li>
                <li class="mb-4 bg-slate-500 p-4 pl-10 pr-10 rounded"><a href="#" class="text-white hover:text-blue-300">Pokedex</a></li>
                <li class="mb-4 bg-slate-500 p-4 pl-10 pr-10 rounded"><a href="#" class="text-white hover:text-blue-300">Buddy</a></li>
                <li class="mb-4 bg-slate-500 p-4 pl-10 pr-10 rounded"><a href="#" class="text-white hover:text-blue-300">Fórum</a></li>
                <li class="mb-4 bg-slate-500 p-4 pl-10 pr-10 rounded"><a href="#" class="text-white hover:text-blue-300">Sobre</a></li>
            </ul>
        </div>

        
        <div class="w-3/5 bg-slate-500 flex flex-col justify-center items-center">
        <ul className=''>
                <li class="mb-4 bg-slate-400 p-4 pl-96 pr-96 rounded mt-36"><a href="#" class="text-white hover:text-blue-300">Avisos</a></li>
                <li class="mb-4 bg-slate-400 p-80 pl-96 pr-96 rounded mt-8"><a href="#" class="text-white hover:text-blue-300"></a></li>
                
                
        </ul>
        
        </div>
      
        
        <div class="w-1/5 bg-blue-400 flex flex-col justify-start items-center">
          
          <ul className=''>
            <img src="https://cdn.icon-icons.com/icons2/851/PNG/512/pokemon_articuro_icon-icons.com_67526.png" alt="" className='mt-8 w-60'></img>
                <li class="mb-4 bg-slate-400 p-36 pb-64 rounded mt-8"><a href="#" class="text-white hover:text-blue-300"></a></li>
          </ul>
        </div>
    </div>
</body>
    
  )
}
