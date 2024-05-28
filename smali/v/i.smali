.class public final synthetic Lv/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/o0$b;


# instance fields
.field public final synthetic a:Lv/j$a;

.field public final synthetic b:Lw/o0;


# direct methods
.method public synthetic constructor <init>(Lv/j$a;Lw/o0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv/i;->a:Lv/j$a;

    iput-object p2, p0, Lv/i;->b:Lw/o0;

    return-void
.end method


# virtual methods
.method public final a(Lw/o0$a;)Z
    .locals 2

    iget-object v0, p0, Lv/i;->a:Lv/j$a;

    iget-object v1, p0, Lv/i;->b:Lw/o0;

    invoke-static {v0, v1, p1}, Lv/j$a;->c(Lv/j$a;Lw/o0;Lw/o0$a;)Z

    move-result p1

    return p1
.end method
