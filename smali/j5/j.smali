.class public final synthetic Lj5/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lj5/x;

.field public final synthetic o:Lt5/b;


# direct methods
.method public synthetic constructor <init>(Lj5/x;Lt5/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj5/j;->n:Lj5/x;

    iput-object p2, p0, Lj5/j;->o:Lt5/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lj5/j;->n:Lj5/x;

    iget-object v1, p0, Lj5/j;->o:Lt5/b;

    invoke-static {v0, v1}, Lj5/n;->f(Lj5/x;Lt5/b;)V

    return-void
.end method
