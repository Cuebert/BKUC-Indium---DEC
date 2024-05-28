.class public final Lcom/android/billingclient/api/e$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/billingclient/api/e$b$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/android/billingclient/api/g;

.field private final b:Ljava/lang/String;


# direct methods
.method synthetic constructor <init>(Lcom/android/billingclient/api/e$b$a;Ln1/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/android/billingclient/api/e$b$a;->d(Lcom/android/billingclient/api/e$b$a;)Lcom/android/billingclient/api/g;

    move-result-object p2

    iput-object p2, p0, Lcom/android/billingclient/api/e$b;->a:Lcom/android/billingclient/api/g;

    invoke-static {p1}, Lcom/android/billingclient/api/e$b$a;->e(Lcom/android/billingclient/api/e$b$a;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/e$b;->b:Ljava/lang/String;

    return-void
.end method

.method public static a()Lcom/android/billingclient/api/e$b$a;
    .locals 2

    new-instance v0, Lcom/android/billingclient/api/e$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/android/billingclient/api/e$b$a;-><init>(Ln1/p;)V

    return-object v0
.end method


# virtual methods
.method public final b()Lcom/android/billingclient/api/g;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/e$b;->a:Lcom/android/billingclient/api/g;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/e$b;->b:Ljava/lang/String;

    return-object v0
.end method
