.class Ls7/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls7/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls7/b;


# direct methods
.method constructor <init>(Ls7/b;)V
    .locals 0

    iput-object p1, p0, Ls7/b$a;->a:Ls7/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Ls7/c;
    .locals 1

    new-instance v0, Ls7/d;

    invoke-direct {v0, p1}, Ls7/d;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
