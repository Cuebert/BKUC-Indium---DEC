.class public Li7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/c;


# instance fields
.field private currency:Ljava/lang/String;

.field private productId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Li7/e;->productId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Li7/e;->currency:Ljava/lang/String;

    return-void
.end method
