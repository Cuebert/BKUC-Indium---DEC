.class public final synthetic Lw3/la;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lg6/n;


# direct methods
.method public synthetic constructor <init>(Lg6/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw3/la;->a:Lg6/n;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lw3/la;->a:Lg6/n;

    invoke-virtual {v0}, Lg6/n;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
