.class public final synthetic Lh2/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj2/b$a;


# instance fields
.field public final synthetic a:Lh2/v;


# direct methods
.method public synthetic constructor <init>(Lh2/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/t;->a:Lh2/v;

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lh2/t;->a:Lh2/v;

    invoke-static {v0}, Lh2/v;->a(Lh2/v;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
