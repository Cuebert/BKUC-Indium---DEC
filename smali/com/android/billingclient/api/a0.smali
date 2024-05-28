.class final Lcom/android/billingclient/api/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/android/billingclient/api/z;


# direct methods
.method constructor <init>(Landroid/content/Context;Ln1/j;Ln1/c;Lcom/android/billingclient/api/n;)V
    .locals 6

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/a0;->a:Landroid/content/Context;

    new-instance p1, Lcom/android/billingclient/api/z;

    const/4 v5, 0x0

    move-object v0, p1

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/android/billingclient/api/z;-><init>(Lcom/android/billingclient/api/a0;Ln1/j;Ln1/c;Lcom/android/billingclient/api/n;Ln1/n0;)V

    iput-object p1, p0, Lcom/android/billingclient/api/a0;->b:Lcom/android/billingclient/api/z;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ln1/z;Lcom/android/billingclient/api/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/a0;->a:Landroid/content/Context;

    new-instance p1, Lcom/android/billingclient/api/z;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2, p3, p2}, Lcom/android/billingclient/api/z;-><init>(Lcom/android/billingclient/api/a0;Ln1/z;Lcom/android/billingclient/api/n;Ln1/n0;)V

    iput-object p1, p0, Lcom/android/billingclient/api/a0;->b:Lcom/android/billingclient/api/z;

    return-void
.end method

.method static bridge synthetic a(Lcom/android/billingclient/api/a0;)Lcom/android/billingclient/api/z;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/a0;->b:Lcom/android/billingclient/api/z;

    return-object p0
.end method


# virtual methods
.method final b()Ln1/z;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/a0;->b:Lcom/android/billingclient/api/z;

    invoke-static {v0}, Lcom/android/billingclient/api/z;->a(Lcom/android/billingclient/api/z;)Ln1/z;

    const/4 v0, 0x0

    return-object v0
.end method

.method final c()Ln1/j;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/a0;->b:Lcom/android/billingclient/api/z;

    invoke-static {v0}, Lcom/android/billingclient/api/z;->b(Lcom/android/billingclient/api/z;)Ln1/j;

    move-result-object v0

    return-object v0
.end method

.method final d()V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "com.android.vending.billing.PURCHASES_UPDATED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const-string v1, "com.android.vending.billing.ALTERNATIVE_BILLING"

    .line 2
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/android/billingclient/api/a0;->b:Lcom/android/billingclient/api/z;

    iget-object v2, p0, Lcom/android/billingclient/api/a0;->a:Landroid/content/Context;

    .line 3
    invoke-virtual {v1, v2, v0}, Lcom/android/billingclient/api/z;->c(Landroid/content/Context;Landroid/content/IntentFilter;)V

    return-void
.end method
