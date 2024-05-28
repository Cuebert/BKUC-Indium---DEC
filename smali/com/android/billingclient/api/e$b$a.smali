.class public Lcom/android/billingclient/api/e$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/e$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/android/billingclient/api/g;

.field private b:Ljava/lang/String;


# direct methods
.method synthetic constructor <init>(Ln1/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static bridge synthetic d(Lcom/android/billingclient/api/e$b$a;)Lcom/android/billingclient/api/g;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/e$b$a;->a:Lcom/android/billingclient/api/g;

    return-object p0
.end method

.method static bridge synthetic e(Lcom/android/billingclient/api/e$b$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/e$b$a;->b:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public a()Lcom/android/billingclient/api/e$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/e$b$a;->a:Lcom/android/billingclient/api/g;

    const-string v1, "ProductDetails is required for constructing ProductDetailsParams."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/j5;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/android/billingclient/api/e$b$a;->b:Ljava/lang/String;

    const-string v1, "offerToken is required for constructing ProductDetailsParams."

    .line 2
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/j5;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/android/billingclient/api/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/android/billingclient/api/e$b;-><init>(Lcom/android/billingclient/api/e$b$a;Ln1/q;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/android/billingclient/api/e$b$a;
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/e$b$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public c(Lcom/android/billingclient/api/g;)Lcom/android/billingclient/api/e$b$a;
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/android/billingclient/api/e$b$a;->a:Lcom/android/billingclient/api/g;

    invoke-virtual {p1}, Lcom/android/billingclient/api/g;->a()Lcom/android/billingclient/api/g$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/android/billingclient/api/g;->a()Lcom/android/billingclient/api/g$a;

    move-result-object v0

    .line 3
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-virtual {p1}, Lcom/android/billingclient/api/g;->a()Lcom/android/billingclient/api/g$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/g$a;->d()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/e$b$a;->b:Ljava/lang/String;

    :cond_0
    return-object p0
.end method
