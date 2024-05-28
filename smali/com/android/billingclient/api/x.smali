.class final Lcom/android/billingclient/api/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/android/billingclient/api/f;

.field private final b:I


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/f;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/x;->a:Lcom/android/billingclient/api/f;

    iput p2, p0, Lcom/android/billingclient/api/x;->b:I

    return-void
.end method


# virtual methods
.method final a()Lcom/android/billingclient/api/f;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/x;->a:Lcom/android/billingclient/api/f;

    return-object v0
.end method

.method final b()I
    .locals 1

    iget v0, p0, Lcom/android/billingclient/api/x;->b:I

    return v0
.end method
