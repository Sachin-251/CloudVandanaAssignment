

//---------BUBBLE SORT----------
// function descendingSort(arr){
//     for(let i=0; i<arr.length-1; i++){
//         for(let j=0; j<arr.length-i-1; j++){
//             if(arr[j]<arr[j+1]){
//                 let temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;
//             }
//         }
//     }
// }

//---------QUICK SORT-------------

function partition(array, low, high){
    let pivot = array[high];
    let i=low-1;

    for(let j=low; j<=high-1; j++){
        if(array[j]>pivot){
            i++;
            [array[i],array[j]] = [array[j],array[i]];
        }
    }

    [array[i+1], array[high]] = [array[high], array[i+1]];
    return i+1;
}

function descendingSort(array, low, high){
    if(low < high){
        let pivot = partition(array, low, high);

        descendingSort(array, low, pivot-1);
        descendingSort(array, pivot+1, high);
    }
}

let array = [1,2,3,4,5,6,7];
let n = array.length;
descendingSort(array, 0, n-1);
console.log(array.join(" "));