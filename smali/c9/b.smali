.class public final synthetic Lc9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc9/a$a;


# instance fields
.field public final synthetic a:Lc9/c;

.field public final synthetic b:Lc9/a$a;


# direct methods
.method public synthetic constructor <init>(Lc9/c;Lc9/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc9/b;->a:Lc9/c;

    iput-object p2, p0, Lc9/b;->b:Lc9/a$a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lc9/b;->a:Lc9/c;

    iget-object v1, p0, Lc9/b;->b:Lc9/a$a;

    invoke-static {v0, v1, p1}, Lc9/c;->b(Lc9/c;Lc9/a$a;Ljava/lang/String;)V

    return-void
.end method
