.class public final Lcom/android/billingclient/api/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private volatile a:Lcom/android/billingclient/api/s;

.field private final b:Landroid/content/Context;

.field private volatile c:Ln1/j;

.field private volatile d:Ln1/c;


# direct methods
.method synthetic constructor <init>(Landroid/content/Context;Ln1/o0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/c$a;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a()Lcom/android/billingclient/api/c;
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/c$a;->b:Landroid/content/Context;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/android/billingclient/api/c$a;->c:Ln1/j;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/android/billingclient/api/c$a;->a:Lcom/android/billingclient/api/s;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/android/billingclient/api/c$a;->c:Ln1/j;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/android/billingclient/api/c$a;->d:Ln1/c;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Please provide a valid listener for Google Play Billing purchases updates when enabling Alternative Billing."

    .line 3
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/android/billingclient/api/c$a;->c:Ln1/j;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/android/billingclient/api/d;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/android/billingclient/api/c$a;->a:Lcom/android/billingclient/api/s;

    iget-object v4, p0, Lcom/android/billingclient/api/c$a;->b:Landroid/content/Context;

    iget-object v5, p0, Lcom/android/billingclient/api/c$a;->c:Ln1/j;

    iget-object v6, p0, Lcom/android/billingclient/api/c$a;->d:Ln1/c;

    const/4 v7, 0x0

    move-object v1, v0

    .line 5
    invoke-direct/range {v1 .. v7}, Lcom/android/billingclient/api/d;-><init>(Ljava/lang/String;Lcom/android/billingclient/api/s;Landroid/content/Context;Ln1/j;Ln1/c;Lcom/android/billingclient/api/n;)V

    return-object v0

    .line 6
    :cond_2
    new-instance v0, Lcom/android/billingclient/api/d;

    const/4 v9, 0x0

    iget-object v10, p0, Lcom/android/billingclient/api/c$a;->a:Lcom/android/billingclient/api/s;

    iget-object v11, p0, Lcom/android/billingclient/api/c$a;->b:Landroid/content/Context;

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v8, v0

    .line 7
    invoke-direct/range {v8 .. v13}, Lcom/android/billingclient/api/d;-><init>(Ljava/lang/String;Lcom/android/billingclient/api/s;Landroid/content/Context;Ln1/z;Lcom/android/billingclient/api/n;)V

    return-object v0

    .line 8
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Pending purchases for one-time products must be supported."

    .line 9
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 10
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Please provide a valid listener for purchases updates."

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 12
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Please provide a valid Context."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()Lcom/android/billingclient/api/c$a;
    .locals 2

    new-instance v0, Lcom/android/billingclient/api/r;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/android/billingclient/api/r;-><init>(Ln1/b0;)V

    invoke-virtual {v0}, Lcom/android/billingclient/api/r;->a()Lcom/android/billingclient/api/r;

    invoke-virtual {v0}, Lcom/android/billingclient/api/r;->b()Lcom/android/billingclient/api/s;

    move-result-object v0

    iput-object v0, p0, Lcom/android/billingclient/api/c$a;->a:Lcom/android/billingclient/api/s;

    return-object p0
.end method

.method public c(Ln1/j;)Lcom/android/billingclient/api/c$a;
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/c$a;->c:Ln1/j;

    return-object p0
.end method
