function solution(numLog) {
    let result = '';
    for (let i = 0; i < numLog.length - 1; i++) {
        let temp = numLog[i + 1] - numLog[i];
        if (temp == 1) {
            result += 'w';
        } else if (temp == -1) {
            result += 's';
        } else if (temp == 10) {
            result += 'd';
        } else if (temp == -10) {
            result += 'a';
        }
    }
    return result;
}