.class Lx7/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw7/a$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx7/g;->j(Landroid/content/Context;Ljava/lang/String;Lx7/g$f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx7/g$f;

.field final synthetic b:Lx7/g;


# direct methods
.method constructor <init>(Lx7/g;Lx7/g$f;)V
    .locals 0

    iput-object p1, p0, Lx7/g$b;->b:Lx7/g;

    iput-object p2, p0, Lx7/g$b;->a:Lx7/g$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lx7/g$b;->a:Lx7/g$f;

    invoke-interface {v0}, Lx7/g$f;->a()V

    return-void
.end method
