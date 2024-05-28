.class public final synthetic Lf7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lf7/e;


# direct methods
.method public synthetic constructor <init>(Lf7/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/c;->n:Lf7/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lf7/c;->n:Lf7/e;

    invoke-static {v0}, Lf7/e;->a(Lf7/e;)V

    return-void
.end method
