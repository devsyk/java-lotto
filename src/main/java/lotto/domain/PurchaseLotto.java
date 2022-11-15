package lotto.domain;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import lotto.view.LottoView;

import java.util.ArrayList;
import java.util.List;

public class PurchaseLotto {
    public static void inputAmount() {
        LottoView.inputLottoAmount();
        String amount = Console.readLine();
        int lottoCnt = Validator.validateMoney(amount) / 1000;
        generateLottoWithCount(lottoCnt);
    }

    public static List<Lotto> generateLottoWithCount(int lottoCnt) {
        LottoView.printLottoCount(lottoCnt);
        return null;
    }
}
