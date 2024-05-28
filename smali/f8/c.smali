.class public Lf8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/c;


# instance fields
.field private isInApp:Z

.field private isRetry:Z

.field private orderId:Ljava/lang/String;

.field private packageName:Ljava/lang/String;

.field private productId:Ljava/lang/String;

.field private token:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/android/billingclient/api/Purchase;ZZ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lf8/c;->packageName:Ljava/lang/String;

    .line 3
    invoke-static {p1}, Lf8/a;->k(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lf8/c;->productId:Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lf8/c;->orderId:Ljava/lang/String;

    .line 5
    iput-boolean p2, p0, Lf8/c;->isRetry:Z

    .line 6
    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->g()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lf8/c;->token:Ljava/lang/String;

    .line 7
    iput-boolean p3, p0, Lf8/c;->isInApp:Z

    return-void
.end method
