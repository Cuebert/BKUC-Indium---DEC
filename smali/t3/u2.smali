.class public final Lt3/u2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:B

.field private final b:B


# direct methods
.method constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit16 v0, p1, 0xe0

    int-to-byte v0, v0

    iput-byte v0, p0, Lt3/u2;->a:B

    and-int/lit8 p1, p1, 0x1f

    int-to-byte p1, p1

    iput-byte p1, p0, Lt3/u2;->b:B

    return-void
.end method


# virtual methods
.method public final a()B
    .locals 1

    iget-byte v0, p0, Lt3/u2;->b:B

    return v0
.end method

.method public final b()B
    .locals 1

    iget-byte v0, p0, Lt3/u2;->a:B

    return v0
.end method

.method public final c()I
    .locals 1

    iget-byte v0, p0, Lt3/u2;->a:B

    shr-int/lit8 v0, v0, 0x5

    and-int/lit8 v0, v0, 0x7

    return v0
.end method
