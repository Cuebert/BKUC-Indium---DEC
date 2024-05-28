.class public Lq7/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq7/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/lang/Throwable;

.field final synthetic c:Lq7/f;


# direct methods
.method public constructor <init>(Lq7/f;ILjava/lang/Throwable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq7/f$a;->c:Lq7/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p2, p0, Lq7/f$a;->a:I

    .line 3
    iput-object p3, p0, Lq7/f$a;->b:Ljava/lang/Throwable;

    return-void
.end method
