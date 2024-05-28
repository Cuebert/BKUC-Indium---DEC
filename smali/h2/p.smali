.class public final synthetic Lh2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj2/b$a;


# instance fields
.field public final synthetic a:Li2/c;


# direct methods
.method public synthetic constructor <init>(Li2/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/p;->a:Li2/c;

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lh2/p;->a:Li2/c;

    invoke-interface {v0}, Li2/c;->b()Ld2/a;

    move-result-object v0

    return-object v0
.end method
