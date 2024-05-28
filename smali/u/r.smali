.class public Lu/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Z


# direct methods
.method public constructor <init>(Lw/y1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-class v0, Lt/b0;

    invoke-virtual {p1, v0}, Lw/y1;->a(Ljava/lang/Class;)Z

    move-result p1

    iput-boolean p1, p0, Lu/r;->a:Z

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lu/r;->a:Z

    return v0
.end method
