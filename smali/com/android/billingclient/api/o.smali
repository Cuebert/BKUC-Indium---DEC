.class final Lcom/android/billingclient/api/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final A:Lcom/android/billingclient/api/f;

.field static final B:Lcom/android/billingclient/api/f;

.field static final C:Lcom/android/billingclient/api/f;

.field public static final synthetic D:I

.field static final a:Lcom/android/billingclient/api/f;

.field static final b:Lcom/android/billingclient/api/f;

.field static final c:Lcom/android/billingclient/api/f;

.field static final d:Lcom/android/billingclient/api/f;

.field static final e:Lcom/android/billingclient/api/f;

.field static final f:Lcom/android/billingclient/api/f;

.field static final g:Lcom/android/billingclient/api/f;

.field static final h:Lcom/android/billingclient/api/f;

.field static final i:Lcom/android/billingclient/api/f;

.field static final j:Lcom/android/billingclient/api/f;

.field static final k:Lcom/android/billingclient/api/f;

.field static final l:Lcom/android/billingclient/api/f;

.field static final m:Lcom/android/billingclient/api/f;

.field static final n:Lcom/android/billingclient/api/f;

.field static final o:Lcom/android/billingclient/api/f;

.field static final p:Lcom/android/billingclient/api/f;

.field static final q:Lcom/android/billingclient/api/f;

.field static final r:Lcom/android/billingclient/api/f;

.field static final s:Lcom/android/billingclient/api/f;

.field static final t:Lcom/android/billingclient/api/f;

.field static final u:Lcom/android/billingclient/api/f;

.field static final v:Lcom/android/billingclient/api/f;

.field static final w:Lcom/android/billingclient/api/f;

.field static final x:Lcom/android/billingclient/api/f;

.field static final y:Lcom/android/billingclient/api/f;

.field static final z:Lcom/android/billingclient/api/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v2, "Google Play In-app Billing API version is less than 3"

    .line 2
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 3
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->a:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    .line 4
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v2, "Google Play In-app Billing API version is less than 9"

    .line 5
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 6
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->b:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    .line 7
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v1, "Billing service unavailable on device."

    .line 8
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 9
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->c:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    const/4 v1, 0x5

    .line 10
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v2, "Client is already in the process of connecting to billing service."

    .line 11
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 12
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->d:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    .line 13
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v2, "The list of SKUs can\'t be empty."

    .line 14
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 15
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->e:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    .line 16
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v2, "SKU type can\'t be empty."

    .line 17
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 18
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->f:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    .line 19
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v2, "Product type can\'t be empty."

    .line 20
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 21
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->g:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    const/4 v2, -0x2

    .line 22
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v3, "Client does not support extra params."

    .line 23
    invoke-virtual {v0, v3}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 24
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->h:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    .line 25
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v3, "Invalid purchase token."

    .line 26
    invoke-virtual {v0, v3}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 27
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->i:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    const/4 v3, 0x6

    .line 28
    invoke-virtual {v0, v3}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v3, "An internal error occurred."

    .line 29
    invoke-virtual {v0, v3}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 30
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->j:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    .line 31
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v3, "SKU can\'t be null."

    .line 32
    invoke-virtual {v0, v3}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 33
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->k:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    const/4 v3, 0x0

    .line 34
    invoke-virtual {v0, v3}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->l:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    const/4 v3, -0x1

    .line 35
    invoke-virtual {v0, v3}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v3, "Service connection is disconnected."

    .line 36
    invoke-virtual {v0, v3}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 37
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->m:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    const/4 v3, 0x2

    .line 38
    invoke-virtual {v0, v3}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v3, "Timeout communicating with service."

    .line 39
    invoke-virtual {v0, v3}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 40
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->n:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    .line 41
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v3, "Client does not support subscriptions."

    .line 42
    invoke-virtual {v0, v3}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 43
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->o:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    .line 44
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v3, "Client does not support subscriptions update."

    .line 45
    invoke-virtual {v0, v3}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 46
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->p:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    .line 47
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v3, "Client does not support get purchase history."

    .line 48
    invoke-virtual {v0, v3}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 49
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->q:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    .line 50
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v3, "Client does not support price change confirmation."

    .line 51
    invoke-virtual {v0, v3}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 52
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->r:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    .line 53
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v3, "Play Store version installed does not support cross selling products."

    .line 54
    invoke-virtual {v0, v3}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 55
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->s:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    .line 56
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v3, "Client does not support multi-item purchases."

    .line 57
    invoke-virtual {v0, v3}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 58
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->t:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    .line 59
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v3, "Client does not support offer_id_token."

    .line 60
    invoke-virtual {v0, v3}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 61
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->u:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    .line 62
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v3, "Client does not support ProductDetails."

    .line 63
    invoke-virtual {v0, v3}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 64
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->v:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    .line 65
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v3, "Client does not support in-app messages."

    .line 66
    invoke-virtual {v0, v3}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 67
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->w:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    .line 68
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v3, "Client does not support alternative billing."

    .line 69
    invoke-virtual {v0, v3}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 70
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->x:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    .line 71
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v1, "Unknown feature"

    .line 72
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 73
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->y:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    .line 74
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v1, "Play Store version installed does not support get billing config."

    .line 75
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 76
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->z:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    .line 77
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v1, "Query product details with serialized docid is not supported."

    .line 78
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 79
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->A:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    const/4 v1, 0x4

    .line 80
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v1, "Item is unavailable for purchase."

    .line 81
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 82
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->B:Lcom/android/billingclient/api/f;

    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    .line 83
    invoke-virtual {v0, v2}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    const-string v1, "Query product details with developer specified account is not supported."

    .line 84
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 85
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object v0

    sput-object v0, Lcom/android/billingclient/api/o;->C:Lcom/android/billingclient/api/f;

    return-void
.end method

.method static a(ILjava/lang/String;)Lcom/android/billingclient/api/f;
    .locals 1

    .line 1
    invoke-static {}, Lcom/android/billingclient/api/f;->c()Lcom/android/billingclient/api/f$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/android/billingclient/api/f$a;->c(I)Lcom/android/billingclient/api/f$a;

    .line 2
    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/f$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/f$a;

    .line 3
    invoke-virtual {v0}, Lcom/android/billingclient/api/f$a;->a()Lcom/android/billingclient/api/f;

    move-result-object p0

    return-object p0
.end method
