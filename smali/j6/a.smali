.class public final synthetic Lj6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw3/na;


# instance fields
.field public final synthetic a:Lw3/c8;


# direct methods
.method public synthetic constructor <init>(Lw3/c8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/a;->a:Lw3/c8;

    return-void
.end method


# virtual methods
.method public final zza()Lw3/sa;
    .locals 3

    iget-object v0, p0, Lj6/a;->a:Lw3/c8;

    new-instance v1, Lw3/f8;

    invoke-direct {v1}, Lw3/f8;-><init>()V

    new-instance v2, Lw3/u8;

    invoke-direct {v2}, Lw3/u8;-><init>()V

    .line 1
    invoke-virtual {v2, v0}, Lw3/u8;->b(Lw3/c8;)Lw3/u8;

    invoke-virtual {v2}, Lw3/u8;->c()Lw3/v8;

    move-result-object v0

    .line 2
    invoke-virtual {v1, v0}, Lw3/f8;->g(Lw3/v8;)Lw3/f8;

    .line 3
    invoke-static {v1}, Lw3/sa;->d(Lw3/f8;)Lw3/sa;

    move-result-object v0

    return-object v0
.end method
